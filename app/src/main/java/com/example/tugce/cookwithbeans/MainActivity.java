package com.example.tugce.cookwithbeans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pickledRecipe;
    private TextView haricotRecipe;
    private TextView tahiniRecipe;
    private TextView greenCasseroleRecipe;
    private TextView saladRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pickledBeans(View view) {
        TextView pickledRecipe = (TextView) findViewById(R.id.pickled_text_view);

            pickledRecipe.setText("Malzemeler\n\n" +
                    "Taze fasulye, tuz, sarımsak" +
                    "\n" +
                    "\n" +
                    "Yapılışı: \n\n" +
                    "Fasulyelerin baş ve uç kısımları bıçakla kesilip, varsa kılçıkları ayıklanır.\n" +
                    "Kaynamakta olan suya atılıp 2-3 dakika haşlanır. Soğuk su içinde soğutulur.\n" +
                    "Turşu kabına konulurken sarımsak, limon ve soğan dilimleri ve isteğe göre çeşitli baharat ilave edilir,\n" +
                    "Üzerine baskı konduktan sonra %6 tuzlu salamura ile doldurulur. \n" +
                    "Diğer işlemler patlıcan turşusundaki gibi yapılır. \n" +
                    "Fasulyenin haşlanarak sade turşusu yapıldığı gibi, diğer malzemelerle birlikte,\n" +
                    "haşlanmadan da turşu yapımında kullanılabilir.\n5 Kişilik"+"                 AFİYET OLSUN");

    }

    public void haricotBeans(View view) {
        TextView haricotRecipe = (TextView) findViewById(R.id.haricot_text_view);

            haricotRecipe.setText("Malzemeler \n\n" +
                    "2 su bardağı Kuru fasulye " +
                "1 adet Sogan \n" +
                "300 gr. Kemikli parça et \n" +
                "4 yemek kaşigi Tereyagi \n" + "2 yemek kaşigi Domates salcasi \n" +
                "1 adet Domates \n" +
                "4 dis Sarimsak \n" +
                "2 adet Kirmizi kucuk sivri biber \n" +
                "Tuz\n\n" +
                " Yapilisi :\n\n" +
                "Kuru fasulye ayıklanır, yıkanır,akşamdan bol su\nile ıslatılır. Ertesi gün yarı pişmiş olarak haşlanır.\n" +
                "İnce doğranmış kuru soğan, parçalanmış et, yağ ile kavrulur,\nsalça konur, karıştırılır. 2 su bardağı su konup pişirilir.\n" +
                "Kuru fasulye ete ilave edilir,\nüzerini bir parmak geçecek kadar su konulup pişirilir,\nsuyu az gelecek olursa, sıcak su eklenebilir.\n" +
                "Kırmızı sivri biberler\nve sarımsaklar bütün olarak, domates ise küçük küçük doğranıp üzerine konur;\n" +
                "bir müddet daha pişirilir,\nateşten alınmadan 10 dakika evvel tuzu atılır.\n" +
                "5 Kişilik                   AFİYET OLSUN");
    }

    public void tahiniBeans(View view) {
        TextView tahiniRecipe = (TextView) findViewById(R.id.tahini_text_view);

        tahiniRecipe.setText("Malzemeler \n\n" +
                "2 su bardağı haşlanmış kuru fasulye \n" +
                "1 su bardağı tahin \n" +
                "1 adet limonun suyu \n" +
                "3-4 diş sarımsak \n" +
                "1 çay kaşığı kimyon \n" +
                "1 çay kaşığı kırmızı biber \n" +
                "1 çay bardağı sıcak su \n" +
                "Yarım demet maydanoz \n" +
                "Tuz \n" +
                "Yapılışı:\n" +
                "Kuru fasulyeler bir gece önceden ıslatılır.\n" +
                "Ertesi gün yumuşayana kadar haşlanır.\n" +
                "Haşlanmış fasulyeler blender ile iyice parçalanır.\n" +
                "Püre halindeki kuru fasulyeye tahin eklenir.\n" +
                "Dövülmüş sarımsaklar, baharatlar ve tuz da eklenip karıştırılır. \n" +
                "Kıvam alması için tercihen kuru fasulyenin\nhaşlandığı sıcak su ile karışım biraz açılır.\n" +
                "İncecik kıyılmış maydanozlar ve limonu da eklenip, karıştırılır.\n" +
                "Meze tabağına yerleştirilip, servis edilir.\n" +
                 "5 Kişilik                  AFİYET OLSUN");
    }

        public void greenCasseroleBeans(View view) {
            TextView greenCasseroleRecipe = (TextView) findViewById(R.id.greenCasserole_text_view);
                 greenCasseroleRecipe.setText(" Malzemeler \n\n" +
                    "2 su bardağı haşlanmış kuru fasulye \n" +
                    "1 su bardağı tahin \n" +
                    "1 adet limonun suyu \n" +
                    "3-4 diş sarımsak \n" +
                    "1 çay kaşığı kimyon \n" +
                    "1 çay kaşığı kırmızı biber \n" +
                    "1 çay bardağı sıcak su \n" +
                    "Yarım demet maydanoz \n" +
                    "Tuz \n\n" +
                    " Yapılışı:\n\n" +
                    "Kuru fasulyeler bir gece önceden ıslatılır.\n" +
                    "Ertesi gün yumuşayana kadar haşlanır.\n" +
                    "Haşlanmış fasulyeler blender ile iyice parçalanır.\n" +
                    "Püre halindeki kuru fasulyeye tahin eklenir.\n" +
                    "Dövülmüş sarımsaklar, baharatlar ve tuz da eklenip karıştırılır. \n" +
                    "Kıvam alması için tercihen\nkuru fasulyenin haşlandığı sıcak su ile karışım biraz açılır.\n" +
                    "İncecik kıyılmış maydanozlar ve limonu da eklenip, karıştırılır.\n" +
                    "Meze tabağına yerleştirilip, servis edilir.\n5 Kişilik" +
                         "                  AFİYET OLSUN");

        }

    public void saladBeans(View view) {
        TextView saladRecipe = (TextView) findViewById(R.id.salad_text_view);
        saladRecipe.setText("Malzemeler \n\n" +
                "250 gr Kuru Fasulye \n" +
                "1 Su Bardağı Sirke \n" +
                "1 Adet İri Soğan \n" +
                "1 Demet Maydanoz \n" +
                "Sos İçin \n" +
                "Tuz, Beyazbiber \n" +
                "2 Çorba Kaşığı Sirke \n" +
                "6 Çorba Kaşığı Zeytinyağı \n" +
                "Süslemek İçin \n" +
                "2 Orta Boy Domates \n" +
                "2 Katı Haşlanmış Yumurta" +
                "\n" +
                "\n" +
                "Yapılışı: \n\n" +
                "1 gün önceden ıslatılmış fasulyelerin üzerlerini\n birkaç parmak aşacak kadar soğuk su koyup,"+
                "harlı ateşte bir taşım kaynatın.\nAğır ateşte yumuşayıncaya kadar pişirin.\nPişme suyunda ılınmaya bırakın.\n" +
                "Süzdürüp çukur bir kaba alın.\nBir bardak sirkeyi ilave edip üzerini bir kapakla kapatın.\n"+
                "Fasulyeleri yaklaşık 2 saat sirke içinde dinlenmeye\nbırakın."+
                "Sosu için tuz, biber ve sirkeyi çukur\nbir kapta iyice karıştırın.\n"+
                "Sürekli çırparak\nzeytinyağını yedirin. 2 saatin sonunda\nfasulyelerin sirkesini süzün.\n"+
                "Piyazlık kesilmiş soğan ve iri kıyılmış maydanoz\nile sirkeli salata sosunu ilave edip iyice karıştırın.\n"+
                "Piyazı bir servis kabına aktarıp domates,\nhaşlanmış yumurta dilimleri ve siyah zeytin ile süsleyip servis yapın.\n"
                +"5 Kişilik" + "                  AFİYET OLSUN");

    }
}