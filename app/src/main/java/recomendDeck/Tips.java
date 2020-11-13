package recomendDeck;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.stoneagedc.AdsFull;
import com.cookandroid.stoneagedc.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class Tips extends AppCompatActivity {
    ArrayList<Recommend> DeckList;
    private AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reco_deck);

        setTitle("꿀팁 게시판");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.InitializePetData();
        final ListView listview = findViewById(R.id.recolist);
        final RecommendListAdapter RecommendListAdapter = new RecommendListAdapter(getApplicationContext(),DeckList);
        listview.setAdapter(RecommendListAdapter);

        // 광고넣기
        AdsFull.getInstance(this);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    private void InitializePetData() {
        DeckList = new ArrayList<Recommend>();

        DeckList.add(new Recommend("맹수왕 4턴 라비루 궁쓰게하는법","각 턴에 체력이 가장 적은 2마리가 기력1을 더 얻습니다.","그래서 첫 턴은 버린다는 느낌으로 라비루만 공격을 하고 나머지 방어를 하면 라비루가 가장 체력이 적어 1기력을 획득합니다."));
        DeckList.add(new Recommend("포획 꿀 팁","현재 펫들이 한방에 죽는 경우가 많습니다.","조련사 능력치 초기화 후 힘을 350까지만 올리고 나머지는 민첩을 주면 도망갈래 하는 펫보다 빨리 잡아 울타리를 소비하지않고 포획 가능합니다.(도망치는거보다 포획이 더 빠릅니다)"));
        DeckList.add(new Recommend("성장의 길 부적,장비강화 쉽게 하는 법","성장의길을 위해 장비강화100회나 부적강화 100회를 해야합니다.","부적이나, 장비 둘 다 45렙제 가장 싼거 구매후 1강을 하고 분해를하면 하나를 다시 줍니다.\n 반복하시면 됩니다."));
        DeckList.add(new Recommend("퀘스트 시간줄이기","메인퀘스트 밀 때 걸어다니는게 짜증나시나요?","부족영지에 들어갔다가 퀘를 누르면 워프합니다 !"));
        DeckList.add(new Recommend("기계침입 빠른 효율","첫 턴에 조련사만 공격하고 후퇴 x10번합니다."," "));
        DeckList.add(new Recommend("한 자리에서 고고학을 하시나요?","증명된건 아니지만, 한 곳이 아닌 여러군데를 돌아다니면서 파는게 더 잘나오는거 같아요"," "));
        DeckList.add(new Recommend("모든 사냥은 30분간 지속이 됩니다.","파티 참가하고 25~30분 간격으로 백그라운드 앱을 들낙하면 30분씩 추가되어 자동사냥이 가능합니다."," "));
        DeckList.add(new Recommend("맹수왕 오투투 활용 ","첫 턴에 왠만한 펫은 방어를 하는데 처음에 오투투 패시브를 맥이고 조련사가 첫 턴에 교체하면 가장 공높은 펫의 치명타 확률이 올라갑니다."," "));
        DeckList.add(new Recommend("도적의 아지트 볼일보기","도적의 아지트에서 수색할 때 후퇴하면 파티 이탈이 됩니다.","볼 일 보시고 다시 합류 가능하세요"));
        DeckList.add(new Recommend("도적의아지트 파티가입","아지트 가입 시 걸어가서 카탄에 본드있음 누를 필요가 없습니다.","오른쪽에 파티 눌러 검색하셔서 도적의 아지트" +
                "누르시면 바로 워프되고 파티에 가입됩니다."));
        DeckList.add(new Recommend("도적의 아지트 스톤3배얻기","현재 가장 좋은 진형은 샌디3, 라비루, 체만모입니다. 추가로 공3천이상 순발800이상 활2분 투척도끼(추격)3분이면 잡몹 1턴 컷 보스 2턴 컷 가능합니다.","" +
                "조금 강하신 분들이 모이셔야 겠지만 한 웨이브(15개방 + 보스방)당 10분이걸립니다. 10분에 46000원 정도 이므로 1시간에 약26만원입니다 기존 만모 수색은 10분에 13000원 정도 " +
                "버는걸 생각하면 스톤을 3배이상 버실 수 있습니다. "));
        DeckList.add(new Recommend("토템50회 뽑의 조개개수는?","약 30 만개입니다"," "));
        DeckList.add(new Recommend("200인 도장의 보상은?","조개는 130 만개정도 스톤은 2500만 -3000만 스톤정도 줍니다\n" +
                "110 장비는 뚝 갑 악세 주고여\n" +
                "180층 190층에서 4성 전설토템 줍니다\n" +
                "200층은 계륵같은 돌주머니 하나 주고여\n" +
                "그외 130 전설부적은 4-6?개 정도 주는거같네요 "," "));
        DeckList.add(new Recommend("티라고스 활용 꿀팁","PVP는 PVE든 펫 교체를 활용해 티라노가 들어오면 CC면역 버프 + 첫 턴에 티라노 들고 다른 펫으로 교체해도 CC 면역 ! "," "));

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                AdsFull.getInstance(this);
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AdsFull.getInstance(this);
    }

}
