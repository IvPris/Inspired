package hr.ferit.ivana.inspired;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @BindView(R.id.name1) TextView name1;
    @BindView(R.id.birth1) TextView birth1;
    @BindView(R.id.about1) TextView about1;
    @BindView(R.id.photo1) ImageView photo1;

    @BindView(R.id.name2) TextView name2;
    @BindView(R.id.birth2) TextView birth2;
    @BindView(R.id.about2) TextView about2;
    @BindView(R.id.photo2) ImageView photo2;

    @BindView(R.id.name3) TextView name3;
    @BindView(R.id.birth3) TextView birth3;
    @BindView(R.id.about3) TextView about3;
    @BindView(R.id.photo3) ImageView photo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        InspiringPerson Turing = new InspiringPerson();
        Turing.setName("Alan Turing");
        Turing.setBirth("23.6.1912.");
        Turing.setDeath("7.6.1954.");
        Turing.setAbout("Britanski matematičar, kriptograf, teoretičar računarstva");
        Turing.setPhoto(R.drawable.alanturing);

        InspiringPerson Lovelace = new InspiringPerson();
        Lovelace.setName("Ada Lovelace");
        Lovelace.setBirth("10.12.1815.");
        Lovelace.setDeath("27.11.1852.");
        Lovelace.setAbout("Britanska matematičarka");
        Lovelace.setPhoto(R.drawable.adalovelace);

        InspiringPerson Ritchie = new InspiringPerson();
        Ritchie.setName("Dennis Ritchie");
        Ritchie.setBirth("9.9.1941.");
        Ritchie.setDeath("12.10.2011.");
        Ritchie.setAbout("Američki računalni znanstvenik");
        Ritchie.setPhoto(R.drawable.dennisritchie);

        showData(Turing, Lovelace, Ritchie);
    }

    @OnClick(R.id.photo1)
    public void displayQuote1(){
        String quote;
        Random rand = new Random();
        int n=rand.nextInt(2);
        quote = getResources().getStringArray(R.array.Turing)[n];
        Toast.makeText(this, quote, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.photo2)
    public void displayQuote2(){
        String quote;
        Random rand = new Random();
        int n=rand.nextInt(2);
        quote = getResources().getStringArray(R.array.Lovelace)[n];
        Toast.makeText(this, quote, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.photo3)
    public void displayQuote3(){
        String quote;
        Random rand = new Random();
        int n=rand.nextInt(2);
        quote = getResources().getStringArray(R.array.Ritchie)[n];
        Toast.makeText(this, quote, Toast.LENGTH_LONG).show();
    }

    private void showData(InspiringPerson p1, InspiringPerson p2, InspiringPerson p3) {
        //Turing
        name1.setText(p1.getName());
        birth1.setText(p1.getBirthDisplay());
        about1.setText(p1.getAbout());
        photo1.setImageResource(p1.getPhoto());

        //Lovelace
        name2.setText(p2.getName());
        birth2.setText(p2.getBirthDisplay());
        about2.setText(p2.getAbout());
        photo2.setImageResource(p2.getPhoto());

        //Ritchie
        name3.setText(p3.getName());
        birth3.setText(p3.getBirthDisplay());
        about3.setText(p3.getAbout());
        photo3.setImageResource(p3.getPhoto());
    }
}
