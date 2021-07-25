package com.example.baustquestionbank;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class MainActivity extends AppCompatActivity {
    ImageView l1t1;
    ImageView l1t2;

    /*EditText editPDFText;
    EditText editLVLText;
    Button btn_upload;

    StorageReference storageReference;
    DatabaseReference databaseReference;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1t1 = findViewById(R.id.l1t1);
        l1t2 = findViewById(R.id.l1t2);

        l1t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Csel1t1.class);
                startActivity(intent);
            }
        });

        l1t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cse_l1t2.class);
                startActivity(intent);
            }
        });


/*        editPDFText = findViewById(R.id.pdfName);
        editLVLText = findViewById(R.id.Lt);
        btn_upload = findViewById(R.id.button);*/

        /*storageReference = FirebaseStorage.getInstance().getReference();
        databaseReference = FirebaseDatabase.getInstance().getReference("Uploads");

        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectPDFFile();

            }
        });*/


    }

/*    private void selectPDFFile() {
        Intent intent = new Intent();
        intent.setType("application/pdf");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select PDF File"), 1);
    }*/

   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK && data != null && data.getData() != null) {
            uploadPDFFile(data.getData());
        }


    }

    private void uploadPDFFile(Uri data) {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Uploading ... ");
        progressDialog.show();

        StorageReference reference = storageReference.child("Uploads/" + editLVLText.getText().toString() + ".pdf"); ///cheng
        reference.putFile(data).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                Task<Uri> uri = taskSnapshot.getStorage().getDownloadUrl();
                while (!uri.isComplete()) ;
                Uri url = uri.getResult();
                uploadPDF uploadPDF = new uploadPDF(editPDFText.getText().toString(), url.toString());
                databaseReference.child(databaseReference.push().getKey()).setValue(uploadPDF);
                Toast.makeText(MainActivity.this, "file uploaded..", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                double progress = (100.0 * taskSnapshot.getBytesTransferred()) / taskSnapshot.getTotalByteCount();

                progressDialog.setMessage("Uploaded: " + (int) progress + " %");

            }
        });
    }

    public void btn_action(View view) {
        startActivity(new Intent(getApplicationContext(),View_PDF_Files.class));
    }*/

   public void onBackPressed(){
       AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
       alertDialogBuilder.setTitle("Confirm Exit..!!");
       alertDialogBuilder.setIcon(R.drawable.baust);
       alertDialogBuilder.setMessage("Are You sure you want to exit...");
       alertDialogBuilder.setCancelable(false);
       alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
           @Override
           public void onClick(DialogInterface dialog, int which) {
               finishAndRemoveTask();
           }
       });
       alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(MainActivity.this,"You clicked on cancel",Toast.LENGTH_LONG).show();
           }
       });

       AlertDialog alertDialog = alertDialogBuilder.create();
       alertDialog.show();
   }
}