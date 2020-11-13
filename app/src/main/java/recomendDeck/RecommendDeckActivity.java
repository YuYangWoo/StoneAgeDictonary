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

import static android.app.PendingIntent.getActivity;

public class RecommendDeckActivity extends AppCompatActivity {
    ArrayList<Recommend> DeckList;
    private AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reco_deck);

        setTitle("티어별 덱진형");
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

        DeckList.add(new Recommend("추천 펫","샌디쟈드, 라비루, 푸테라, 만모, 모가로스, 오투투 ,킹북이, 문울프, 카키, 얀기로, 토끼, 핑코, 골드로비, 티라고스","현재 가장 많이 사용하는 펫들을 모아놓았습니다."));
        DeckList.add(new Recommend("기계침입 덱","쟈그, 샌디쟈드, 라비루, 모가로스, 크랩, 기로, 얀기로","기계침입에서 많이 쓰는 펫을 모았습니다."));
        DeckList.add(new Recommend( "OP","샌디쟈드 + 푸테라(골드로비) + 만모 + 핑코(3성여우) + 라비루"," 여전히 OP입니다. 라비루의 순발을 최대로 끌어올려서 라비루의 궁 후 핑코의 궁으로 기력을 제거하고 뚜까 패는 덱입니다."));
        DeckList.add(new Recommend( "OP","샌디쟈드 + 푸테라(골드로비) + 티라고스 + 핑코(3성여우) + 라비루"," 티라고스 패시브로 안전하게 2턴 여우 매혹으로 이어지는 완벽한 덱 ! 만모 대신에 티라고스를 쓰는 추세입니다."));
        DeckList.add(new Recommend( "OP","토끼 + 만모 + 모가로스 + 얀기로 + 샌디쟈드","토끼 액티브로 -상태이상 버프(여우카운터) + 액티브딜로 첫 턴에 백여우를 죽이는 등 첫 턴에 한명은 삭제됩니다. 취향에 따라 킹북이를 넣곤 합니다."));
        DeckList.add(new Recommend( "OP","라비루 + 백여우 + 골드로비 + 샌디쟈드 + 만모","골드로비의 사기적인 보호막으로 백여우의 안전을 책임! 유지력이나 pvp정말 좋습니다."));
        DeckList.add(new Recommend( "OP","토끼 + 만모 + 모가로스 + 샌디쟈드 + 라비루","토끼 액티브로 -상태이상 버프(여우카운터) + 안정성과 딜도 빵빵함"));
        DeckList.add(new Recommend( "1티어","샌디쟈드 + 만모 + 푸테라(골드로비) + 라비루 + 모가로스","모가로스 액티브와 회피하며 궁으로 딜넣는 샌디쟈드 현재 정말 강력합니다."));
        DeckList.add(new Recommend( "1티어","핑코 + 라비루 + 만모 + 푸테라(골드로비) + 크로톤","핑코의 지속CC와 크로톤의 궁으로 전체 CC를 거는 덱"));
        DeckList.add(new Recommend( "1티어","만모 + 샌디쟈드 + 얀기로 + 라비루 + 오투투","오투투 치명타 증가와 샌디쟈드의 딜+회피는 강합니다."));
        DeckList.add(new Recommend( "1티어","만모 + 골드로비 + 푸테라 + 라비루 + 샌디쟈드","절대 안죽는 좀비덱이지만 딜이 부족하고 여우에 약한 덱"));
        DeckList.add(new Recommend( "1.5티어","핑코 + 다이노 + 만모 + 킹북이 + 라비루","적에게 CC를 걸어서 만모 킹북이 다이노 딜로 천천히 죽입니다."));
        DeckList.add(new Recommend( "1.5티어","얀기로 + 푸테라 + 만모 + 다이노 or 킹북이 + 라비루","만모 +북이나 다이노의 도발과 얀기로로 딜을 하는 조합"));
        DeckList.add(new Recommend( "1.5티어","얀기로 + 푸테라 + 만모 + 트라로포 + 라비루","강한 딜러2명이서 궁 치명타로 한명 씩 꺠부시기 가능"));
        DeckList.add(new Recommend( "1.5티어","얀기로 + 푸테라 + 만모 + 백설토끼 + 라비루","백설토끼의 상태이상 저하를 바탕으로 얀기로가 딜 체력과 딜 안정스러움"));
        DeckList.add(new Recommend( "2티어","얀기로 + 푸테라 + 만모 + 오투투 + 라비루","적 버프제거+방어무시딜 첫 턴 딜러삭제가 가능합니다."));
        DeckList.add(new Recommend( "2티어","얀기로 + 푸테라 + 만모 + 큐이 + 라비루","안정적인 체력회복과 딜을 뽐냅니다."));
        DeckList.add(new Recommend( "2티어","얀기로 + 푸테라 + 만모 + 쿠쿠링 + 라비루","쿠쿠링과 얀기로의 딜 살짝 부족한 느낌"));
        DeckList.add(new Recommend( "3티어","얀기로 + 푸테라 + 만모 + 베르가 + 라비루","단일딜과 다중딜 서브딜러로 뭔가 아쉽.."));
        DeckList.add(new Recommend( "3티어","얀기로 + 푸테라 + 만모 + 크랩+ 라비루","크랩궁이 아무나 때려서 어중간합니다.."));
        DeckList.add(new Recommend( "3티어","얀기로 + 푸테라 + 만모 + 고르돈+ 라비루 (좋은 딜과 고르돈의 높은체력으로 찍어누르기)","고르돈 딜이 괜찮아서 쓸만은 한데 다른게 더좋은느낌?"));
        DeckList.add(new Recommend( "3티어","얀기로 + 푸테라 + 만모 + 킹우리 + 라비루","킹우리 딜로 가서 궁딜 나쁘진않은데 뭔가아쉽 "));
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
