package hk.ust.cse.comp107x.myassg4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import android.view.View;
import android.view.View.OnClickListener;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.EditText;

        public class MainActivity extends AppCompatActivity {
            Button button3;


            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);


                setContentView(R.layout.activity_main);}


            Button Camera=(Button)findViewById(R.id.Camera);
Camera.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    startActivity(intent);
                }
            });

            Button call=(Button)findViewById(R.id.call);
    call.setOnClickListener(new OnClickListener() {
                public void onClick (View v )
                {
                    EditText txt = (EditText) findViewById(R.id.editText4);
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+txt.getText())));
                }


                Button watsapp=(Button)findViewById(R.id.watsapp);
                watsapp.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick (View v)
                    {

                        EditText txtFname = (EditText) findViewById(R.id.editText);
                        EditText txtLname = (EditText) findViewById(R.id.editText2);

                        EditText txtnumber = (EditText) findViewById(R.id.editText4);
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT,
                                "hey i am "+ txtFname.getText().toString()
                                        +  " "     + txtLname.getText().toString()
                                        + ", i am using WhatsApp, you can text me on it" );

                        sendIntent.setType("text/plain");
                        // sendIntent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.com.WhatsApp"));
                        //startActivity(Intent.createChooser(sendIntent, ""));
                        sendIntent.setPackage("com.whatsapp");
                        startActivity(sendIntent);

                    }




                    public void btnSendClick (View v )
                    {
                        EditText txt = (EditText) findViewById(R.id.txtEmail);
                        Intent emailIntent = new Intent(Intent.ACTION_SEND);
                        // The intent does not have a URI, so declare the "text/plain" MIME type
                        emailIntent.setType("text/plain");
                        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"jon@example.com"}); // recipients
                        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email subject");
                        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text");
                        emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));
                        emailIntent.setPackage("com.google.android.gm");
                        startActivity(emailIntent);
                    }


                    Button SignUp = (Button) findViewById(R.id.SignUp);


        SignUp.setOnClickListener(new View.OnClickListener() {
                        @override
                        public void onClick(View v) {


                            String str = new String();
                            EditText txtFname = (EditText) findViewById(R.id.editText);
                            EditText txtLname = (EditText) findViewById(R.id.editText2);

                            EditText txtnumber = (EditText) findViewById(R.id.editText4);
                            EditText txtmail = (EditText) findViewById(R.id.email);
                            EditText txtmsg = (EditText) findViewById(R.id.editText5);


                            Intent myintent = new Intent();
                            myintent.setAction(Intent.ACTION_SEND);
                            myintent.putExtra(Intent.EXTRA_EMAIL, new String[] {"zamel@example.com"});

                            myintent.putExtra(Intent.EXTRA_TEXT,
                                    " Heey my name is " +
                                            txtFname.getText().toString() + " " +
                                            txtLname.getText().toString() +"\n"+
                                            " and my phone number is: " + txtnumber.getText().toString() + " " +
                                            "u can talk to me on whatsapp, " +"\n"+
                                            " Email: " + txtmail.getText().toString() + "\n"+
                                            " for sure i am "+str.toString() + "\n" +
                                            "_____________"+ "\n" +
                                            "this is my message to you mr zamel : "+"\n"
                                            + txtmsg.getText().toString());
                            myintent.setType("text/plain");
                            myintent.setPackage("com.google.android.gm");
                            startActivity(myintent);




    }
});
                }