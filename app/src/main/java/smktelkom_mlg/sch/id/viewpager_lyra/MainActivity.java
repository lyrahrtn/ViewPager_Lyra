package smktelkom_mlg.sch.id.viewpager_lyra;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.tab)
    TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ViewPagerAdapter ViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(ViewPagerAdapter);
        tab.setupWithViewPager(pager);
    }
}

