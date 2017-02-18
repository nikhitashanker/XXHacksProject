package nikhi.xxhacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;

import java.util.ArrayList;


/**
 * Created by nikhi on 2/18/17.
 */
public class PetitionActivity extends AppCompatActivity {

    ArrayList<Issue> issues;
    public User myUser;
    ListView list;
    String[] web = new String[18];
    Integer[] imageId = new Integer[18];
    String[] urls = new String[18];
    ArrayList<Petition> petitions = new ArrayList<Petition>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition);
        myUser = (User)(getIntent().getExtras().getSerializable("myObject"));
        issues = new ArrayList<Issue>();
        issues.add(new Issue("women", myUser.getWomen()));
        issues.add(new Issue("civil", myUser.getCivil()));
        issues.add(new Issue("lgbt", myUser.getLGBT()));
        issues.add(new Issue("imm", myUser.getImm()));
        issues.add(new Issue("mino", myUser.getMino()));
        issues.add(new Issue("edu", myUser.getEducation()));
        System.out.println(myUser.getWomen());
        System.out.println(myUser.getCivil());
        System.out.println(myUser.getLGBT());



        for (int i = issues.size() - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (issues.get(j).getRating() > issues.get(j + 1).getRating()) {
                    Issue temp = issues.get(j);
                    issues.set(j, issues.get(j + 1));
                    issues.set(j + 1, temp);
                }
            }
        }

        for (int i = 5; i >= 0; i--)
        {
            if (issues.get(i).getName().equals("women"))
            {
                petitions.add(new Petition("Do not cut the Office of Violence aginst Women!: \n This office " +
                        "is vital for the protection of women’s rights and " + "" +
                        "the reduction of sexual assault and domestic violence", R.drawable.image1, "https://petitions.whitehouse.gov/petition/do-not-cut-office-violence-against-women"));
                petitions.add(new Petition("Women’s REAL issues deserve a debate: \n It's time for presidential candidates to go on record about issues that affect all women and their families.", R.drawable.image1, "https://www.change.org/p/to-our-presidential-candidates-women-s-real-issues-deserve-a-debate"));
                petitions.add(new Petition("Ratify the Equal Rights Amendment: \n Equality of rights under the law shall not be denied or abridged by the United States or by any state on account of sex.", R.drawable.image1, "https://www.change.org/p/ratify-the-equal-rights-amendment-equalmeansequal"));

            }
            if (issues.get(i).getName().equals("civil"))
            {
                petitions.add(new Petition("Secure basic civil rights for sexual assault survivors: \n A year after my first assault in Harvard I filed a case but my assailant, another student, wasn’t expelled and still had a four year transcript and even spoke at our graduation ceremony.", R.drawable.image1, "https://www.change.org/p/richard-neal-secure-basic-civil-rights-for-sexual-assault-survivors"));
                petitions.add(new Petition("Let Students see historical civil Rights Drama: \n We want our county’s superintendent to lift the ban on school trips to see Selma, the historical civil rights drama.", R.drawable.image1, "https://forcechange.com/137748/let-students-see-historical-civil-rights-drama/"));
                petitions.add(new Petition("Declare Civil Right sites as a national monument: \n  The president should ask that several notable civil rights sites in Birmingham, Alabama, become the nation’s latest national historical park.", R.drawable.image1, "https://forcechange.com/161563/declare-civil-rights-sites-a-national-park/\n"));

            }
            if (issues.get(i).getName().equals("lgbt"))
            {
                petitions.add(new Petition("Demand Trump administration add LGBT rights, climate change, and civil rights back to list of issues on wh.gov site: \n The executive administration should prioritize the rights of all Americans and our climate by re-enacting those policies.", R.drawable.image1, "https://petitions.whitehouse.gov/petition/demand-trump-administration-add-lgbt-rights-climate-change-and-civil-rights-back-list-issues-whgov-site"));
                petitions.add(new Petition("Open civil partnerships to all: \n Marriage is available to both same-sex and different-sex couples, but civil partnerships are currently only available to same-sex couples. This limits the choice for different-sex couples, who want to form a civil partnership", R.drawable.image1, "https://www.change.org/p/equalities-minister-justine-greening-govt-equality-open-civil-partnerships-to-all"));
                petitions.add(new Petition("Safeguard civil rights for LGBT persons: \n LGBT Americans are currently unprotected at the federal level by civil rights legislation and are therefore subject to discrimination in employment, housing, and public accommodation.", R.drawable.image1, "https://forcechange.com/154274/safeguard-civil-rights-for-lgbt-persons/"));

            }
            if (issues.get(i).getName().equals("mino"))
            {
                petitions.add(new Petition("Stop the Dakota Access Pipeline: \n The DAPL has great potential to leak into the Missouri River and cause harm to the great people of this nation whose water and livelihood depends on the river. Sign to demand a stop to the Dakota Access Pipeline.", R.drawable.image1, "https://www.change.org/p/stop-the-dakota-access-pipeline"));
                petitions.add(new Petition("Repeal discriminatory travel restrictions: \n Discriminatory travel restrictions are bad for business and for America and are inconsistent with American values.\n", R.drawable.image1, "https://www.change.org/p/u-s-congress-repeal-discriminatory-travel-restrictions-equaltravel"));
                petitions.add(new Petition("Maintain the stay to reroute the Dakota Access Pipeline. Protect the water supply of the Standing Rock Sioux Reservation: \n The Sioux cannot construct alternate access to water outside of their reservation. The natural watershed has a permanent precedent of necessity.", R.drawable.image1, "https://petitions.whitehouse.gov/petition/maintain-stay-reroute-dakota-access-pipeline-protect-water-supply-standing-rock-sioux-reservation"));


            }
            if (issues.get(i).getName().equals("imm"))
            {
                petitions.add(new Petition("Repeal Muslim Immigration Ban: \n Exec Order, Protecting the Nation From Foreign Terrorist Entry Into the United States: \n Repeal the executive order that discriminates against immigrants and minorities on the basis of religion.", R.drawable.image1, "https://petitions.whitehouse.gov/petition/repeal-muslim-immigration-ban-exec-order-protecting-nation-foreign-terrorist-entry-united-states"));
                petitions.add(new Petition("Do not ban Muslims from entering the U.S.: \n Donald Trump should repeal his executive order because it violates the rights of immigrants who are banned from the US on the basis of religion. ", R.drawable.image1, "https://www.change.org/p/do-not-ban-muslims-from-entering-the-united-states"));
                petitions.add(new Petition("Stop President Trump’s Order to Blocks Arrival at Airports for Visa and Green Card Holders: \n Stop President Trump’s order to blocks at airports because it is against our economic interest and will trigger reciprocal actions internationally.", R.drawable.image1, "https://petitions.whitehouse.gov/petition/stop-president-trumps-order-blocks-arrival-airports-visa-and-green-card-holders"));


            }
            if (issues.get(i).getName().equals("edu"))
            {
                petitions.add(new Petition("Education is a necessity, let it be VAT free: \n Appeal the recent imposition of a 14% VAT tax on education-related expenses.", R.drawable.image1, "https://www.ipetitions.com/petition/education-vat-free?utm_source=ipetitions&utm_medium=homepage&utm_campaign=featured"));
                petitions.add(new Petition("Resign, Betsy Devos: \n Secretary of Education, Betsy Devos should step down for a more qualified candidate.", R.drawable.image1, "https://www.change.org/p/betsy-devos-resign"));

                petitions.add(new Petition("Do Not Let Misogynistic Lawmaker Head Educational Task Force: \n President Donald Trump should rescind Jerry Falwell Jr.’s appointment to head of education task force.", R.drawable.image1, "https://forcechange.com/175469/do-not-let-misogynistic-lawmaker-head-educational-task-force/"));

            }
        }
        for (int i = 0; i < 18; i++) {
            web[i] = petitions.get(i).getName();
            imageId[i] = petitions.get(i).getImage();
            urls[i] = petitions.get(i).getUrl();
        }


        CustomList adapter = new
                CustomList(PetitionActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(PetitionActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(urls[position]));
                startActivity(browserIntent);
            }
        });




    }
}
