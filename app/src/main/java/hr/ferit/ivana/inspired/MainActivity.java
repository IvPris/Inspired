package hr.ferit.ivana.inspired;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {
    @BindView(R.id.name) TextView name;
    @BindView(R.id.birth) TextView birth;
    @BindView(R.id.about) TextView about;
    @BindView(R.id.photo) ImageView photo;

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

        showData(Turing);
    }

    private void showData(InspiringPerson person) {
        this.name = findViewById(R.id.name);
        name.setText(person.getName());
        this.birth = findViewById(R.id.birth);
        birth.setText(person.getBirthDisplay());
        this.about = findViewById(R.id.about);
        about.setText(person.getAbout());
    }
}
