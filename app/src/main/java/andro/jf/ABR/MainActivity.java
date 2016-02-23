package andro.jf.ABR;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Bouton broadcast
    Button broad = (Button)findViewById(R.id.send);
    broad.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent broadcast = new Intent("andro.jf.broadcast");
        broadcast.putExtra("extra", "test");
        sendBroadcast(broadcast, "andro.jf.mypermission");
      }
    });

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
