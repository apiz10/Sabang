package id.ac.unsyiah.elektro.mobile.sabang;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class CariHotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_hotel);

        TextView listhotel = (TextView) findViewById(R.id.list_hotel);
        listhotel.setText("BALOHAN\n" +
                "Wisma Mentari, at ferry terminal, Balohan.\n" +
                "Ph: 0852 329992. 6 rooms. Fan, outside\n" +
                "bath: Rp. 90.000. Aircon: Rp. 180.000\n" +
                "\n" +
                "COT BA'U\n" +
                "Penginapan Seulanga (SMK Sabang)\n" +
                "6 rooms with fan 1 Aircon\n" +
                "Ph. 085260284366\n" +
                "\n" +
                "\n" +
                "KOTA SABANG\n" +
                "\n" +
                "Sabang Hill, \n" +
                "The classical hotel on Sabang\n" +
                "Hill with the grand view over Sabang. Tel:\n" +
                "0652-21999, acehsabanghill@yahoo.com\n" +
                "www.sabanghill-aceh.com 22 rooms. With\n" +
                "aircon, bath: Rp. 400-1.000.000. Suite: Rp.\n" +
                "1.150.000. Incl. breakfast. Discount during\n" +
                "weekdays and for longer stays. Meeting\n" +
                "room for 30 persons. Karaoke bar.\n" +
                "\n" +
                "Keunangan Guest House\n" +
                "Jln. Nyak Adam Kamil No 59 Kota Atas\n" +
                "5 rooms, Ph. 081263374813\n" +
                " \n" +
                "Wisma Zahira, Jl. T. Umar, near waterfront.\n" +
                "Tel: 0813 4882 0811. 9 rooms. With aircon,\n" +
                "bath, TV: Rp: 250-350.000. Free coffee and\n" +
                "tea.\n" +
                "\n" +
                "Kartini Home Stay, Jl. T Umar 25. Tel:\n" +
                "0812 6925 510, 0852 27065 5169. 5 rooms.\n" +
                "With fan, bath: Rp. 100.000. With aircon,\n" +
                "bath: Rp. 200-250.000, incl. breakfast, coffee\n" +
                "and tea.\n" +
                "\n" +
                "Sabang Guesthouse. Jl. T. Umar 23-25.\n" +
                "Tel: 0652-21186. 9 rooms. With aircon,\n" +
                "bath, TV: Rp. 325-350.000, incl. breakfast,\n" +
                "coffee and tea. WiFi.\n" +
                "\n" +
                "Hotel Putra Salju, Jl. T. Umar 16. Tel:\n" +
                "0652-22747. 10 rooms. With aircon, bath,\n" +
                "hot water, TV: Rp. 200-450.000. WiFi.\n" +
                "\n" +
                "Guesthouse Pantai Kasih, Jl. Sultan\n" +
                "Hasanuddin 10. Tel: 0652-21066, 0813\n" +
                "7734 7444 (Ayie), www.pantaikasih.com 8\n" +
                "rooms. With fan, bath: Rp. 200-225.000.\n" +
                "With aircon, bath, hot water, TV: Rp. 300-\n" +
                "350.000, incl. breakfast.\n" +
                "\n" +
                "Nagoya Inn, Jl. Cut Meutia 34. Tel: 0652-\n" +
                "22311, 0812 699 6068 (Mr. Parlan),\n" +
                "www.nagoyainn.com 19 rooms. Aircon,\n" +
                "bath, hot water, satellite TV: Rp. 300-\n" +
                "500.000, incl. breakfast, coffee and tea.\n" +
                "WiFi. Meeting room for 50 persons\n" +
                "\n" +
                "Losmen Calok. Jl. Malahayati. Tel: 0852\n" +
                "6036 2584. calok@gmail.com 8 rooms.\n" +
                "With aircon, bath: Rp. 150-225.000.\n" +
                "Losmen Sabang-Merauke, Off Jl. T.\n" +
                "Umar. Tel: 0652-21928 12 rooms 1-3 beds.\n" +
                "Very basic.\n" +
                "Pulau Jaya Hotel, Jl. T. Umar 21. Tel:\n" +
                "0652-21344. 23 rooms. With fan, outside\n" +
                "bath: Rp. 40-85.000. With fan, bath:\n" +
                "125.000. With aircon, bath, TV: Rp.\n" +
                "180.000.\n" +
                "\n" +
                "Losmen Kartika, Jl. T. Umar 17-19. Tel:\n" +
                "0652-22168. 14 rooms. With fan, outside\n" +
                "bath: Rp. 80.000. With Aircon, bath, TV:\n" +
                "Rp. 180.000.\n" +
                "\n" +
                "Losmen PUM , Jl. T. Umar 3. Tel: 0652-\n" +
                "21148. 13 rooms. Most with fan, outside\n" +
                "bath. Some with aircon, bath, TV.\n" +
                "\n" +
                "Hotel Holiday,  Jl. Perdagangan. Tel:\n" +
                "0652-21131, facebook.com/holidayhs 24\n" +
                "rooms. With fan, bath: Rp. 100-200.000.\n" +
                "With aircon, bath: Rp. 250-350.000.\n" +
                "\n" +
                "Montana Hotel, Jl. Surapati 20. Tel: 0652-\n" +
                "22817, 0852 6177 5831, hotelmontana@\n" +
                "ymail.com 20 rooms. With fan, outside\n" +
                "bath: Rp. 100.000. Aircon, bath: Rp.\n" +
                "225-500.000. Aircon, bath, 6 beds: Rp.\n" +
                "600.000. Wifi.\n" +
                "\n" +
                "Penginapan Pondok Tapak Gajah, Lingkungan\n" +
                "Keramat, Jl. Agus Salim. Near\n" +
                "Merbabu graveyard. Tel: 0652-22378, 0812\n" +
                "6954 5700, iskandarmuda62@yahoo.com\n" +
                "12 rooms. With fan, outside bath: Rp.\n" +
                "75.000. Fan, bath: Rp. 125.000. Aircon,\n" +
                "bath: Rp. 200.000.Pantai Kasih\n" +
                "\n" +
                "Citra Hotel\n" +
                "Jl.Teuku Umar No 15 Sabang\n" +
                "telp 0652-21172\n" +
                "fb.Hotel Citra\n" +
                "\n" +
                "\n" +
                "\n" +
                "KINCIR - Iboih Area\n" +
                "\n" +
                "Tien's Place. Tel: +6285277775212. Fb:\n" +
                "Tien's Place. 2 km beyond the Iboih junction.\n" +
                "4 bungalows with bathroom, Rp.300.000\n" +
                "\n" +
                "Pulau Weh Dive Resort. Jl. Km Nol Iboih.\n" +
                "Tel: +62652 33324999, fax: +62652\n" +
                "2324900. www.wehresort.com 13 rooms,\n" +
                "aircon, hot water. Rp. 1.250-1.900.000. WiFi.\n" +
                "Restaurant.\n" +
                "\n" +
                "Seulako View Cafe & Bungalows\n" +
                "Just along the main road. Ph: 085260920505\n" +
                "Iswardani, seulako.view@gmail.com, fb:\n" +
                "Seulako View Cafe & Bungalows. 3 bungalows\n" +
                "w. fan, private or shared bathroom, Rp. 100-\n" +
                "150.000. 3 rooms, fan, shared bath: Rp. 50-\n" +
                "70.000. Accept camping. Restaurant. Small\n" +
                "shop with essentials and swap books. Parking.\n" +
                "\n" +
                "Steffen Sea Sports Home Stay. Tel:\n" +
                "+62081360811848. steffenseasports@yahoo.c\n" +
                "om www.steffen-sea-sports.com\n" +
                "www.steffenseasports.sumatraecotourism.co\n" +
                "m 4 rooms above the dive shop. With fan,\n" +
                "bathrooms: Rp. 200.000. One six bed dorm:\n" +
                "Rp. 250.000. Has also 3-pin plugs. \n" +
                " \n" +
                "IBOIH\n" +
                "\n" +
                "Yulia's Bungalow & Restaurant. Tel:\n" +
                "0821 6856 4383 (Mr. Randi). 18 bungalows.\n" +
                "Outside bath: Rp. 60-70.000. Fan\n" +
                "and bath: 150-200.000.\n" +
                "\n" +
                "Iboih Inn & Restaurant. Tel: 0811841570,\n" +
                "08126991659. iboih.inn@gmail.com\n" +
                "www.iboihinn.com 16 bungalows. Budget\n" +
                "room w bath: Rp. 100.000. With fan, bathroom:\n" +
                "Rp. 250.000. W aircon, bath, hot\n" +
                "water: Rp. 350.000. Incl. breakfast for nonbudget\n" +
                "rooms.\n" +
                "\n" +
                "O'Ong Rest. & Bungalows. 10 bungalows.\n" +
                "Outside bath: Rp. 40-50.000. With\n" +
                "bath: Rp. 130-150.000. Price depending on\n" +
                "length of stay.\n" +
                "\n" +
                "Olala Cafe & Restaurant . Tel:\n" +
                "085260607311, eka_olala@hotmail.co.uk.\n" +
                "8 bungalows. W fan, outside bath: Rp.\n" +
                "70.000. Fan, bath: Rp 150.000. WiFi.\n" +
                "\n" +
                "Mama Mia Restaurant & Bungalows. \n" +
                "1 basic budget bungalow.\n" +
                "\n" +
                "Fatimah Bungalows. Ph: +62652-\n" +
                "3324107. 6 bungalows. With bath: Rp.\n" +
                "120-200.000 depending on season and\n" +
                "length of stay. .\n" +
                "\n" +
                "Iboih Hill Bungalows. Reception in Dolphin\n" +
                "Restaurant. Tel: 081360189132. 7 bungalows,\n" +
                "outside bath, fan: Rp. 150.000. Discounts\n" +
                "for long stays.\n" +
                "\n" +
                "Ayub's 2 rooms and 1 bathroom in one bungalow.\n" +
                "Rp. 150.00/room. Discounts for long\n" +
                "stay. Ask for Mr. Ayub at the parking area or\n" +
                "ask in Erick's next door.\n" +
                "\n" +
                "Erick's Green House. Tel: 082167899876.\n" +
                "5 rooms. Some with attached bath, all with\n" +
                "kitchenette. Rp. 60-150.000. Discounts for\n" +
                "long stay. WiFi.\n" +
                "\n" +
                "Fina Bungalow. Just before the gate. Tel:\n" +
                "085262111366. Fb: Fina Bungalow. 10 rooms.\n" +
                "With fan, bath: Rp. 150-200.000. Aircon, bath:\n" +
                "Rp. 250-350.000. Price depending on season.\n" +
                "\n" +
                "Cut Agam Guest house & Coffee Shop. First\n" +
                "place when coming down to Iboih. Tel:\n" +
                "081360363480. 4 rooms. Fan, outside bath:\n" +
                "Rp. 150-200.000. Discounts for long stay.\n" +
                "Pasta restaurant.\n" +
                "\n" +
                "Jelita Bungalows. Tel: 0821 6446 8376. 3\n" +
                "rooms. Aircon, bath, TV: Rp. 250.000.\n" +
                "\n" +
                "Pele's Ujung Patek Bungalows. At the Petek\n" +
                "Point, 500m south of Iboih. Tel: 085260958990\n" +
                "(adun), 0852 5370 2209 (Wani). doktorkalkyl@\n" +
                "gmail.com 2 bungalows. With fan, bath:\n" +
                "Rp. 250.000.\n" +
                "\n" +
                "Pulau Rubiah, Can only be reached by\n" +
                "boat. Ph: 0813 774 11125 (Mr. Samsul),\n" +
                "0852 7746 4764 (Mr. Yahya). 8 bungalows.\n" +
                "Outside bath: Rp. 100.000. Big two room\n" +
                "bungalow with bathroom, kitchen: Rp.\n" +
                "300.000. Restaurant. Call for pick up. From\n" +
                "Iboih parking area: Rp. 50.000.\n" +
                "\n" +
                "GAPANG - Iboih\n" +
                "\n" +
                "Guest House Obama, Jl. Sabang-Iboh, 1 km\n" +
                "beyond Gapang gate. Tel: 0813 6027 2270\n" +
                "(Mrs. Minna). 14 rooms. With aircon, bath: Rp.\n" +
                "200.000, incl. breakfast. Restaurant.\n" +
                "\n" +
                "Agha Hideaway. 50m above/behind the Naguna\n" +
                "restaurant at Gapang gate. Tel: 0852\n" +
                "7744 2222 (Mustafa), gpg_m@yahoo.com 1\n" +
                "roomy bungalow, bath: Rp. 150.000 if fan, Rp.\n" +
                "250.000 if aircon. Great view. Good for long\n" +
                "stays.\n" +
                "\n" +
                "Gapang Resort Former Leguna and Flamboyan\n" +
                "resorts. Government owned, to be\n" +
                "leased. Tel: 0652-3324564. 21 bungalows with\n" +
                "27 rooms. With fan, bath: Rp. 150.000. aircon,\n" +
                "bath: Rp. 250.000. 2 and 3 room aircon bungalows:\n" +
                "Rp. 350-400.000. Restaurant not open\n" +
                "yet. Meeting room for 200 people\n" +
                ".\n" +
                "Dang Dang Na Restaurant & Bungalow Tel:0852 6041 8854 (Mr. Syukur). 6 bungalows.\n" +
                "With fan, bath: Rp. 100.000. With aircon, bath:\n" +
                "Rp. 200.000. No booking over phone. Popular.\n" +
                "\n" +
                "Lumba Lumba Living and Living Colors Tel/Fax: 0652-3324133, 0811 682 787.\n" +
                "www.lumbalumba.com 7 diver adapted duplex\n" +
                "bungalows (11 rooms). With fan, bath,\n" +
                "In new extension 6 rooms with\n" +
                "Chephest Bungalows. Tel: 0853 5884 9551.\n" +
                "1 bungalow. With fan, bath: Rp. 100.000, free\n" +
                "drinking water.\n" +
                "\n" +
                "Vira Bungalow. Tel: 0852 9747 0446. 6\n" +
                "rooms. With fan, outside bath: Rp. 100.000.\n" +
                "For long stay: Rp. 50.000\n" +
                "\n" +
                "Jroeh Bungalow, behind the souvenir shop.\n" +
                "Tel: 0852 6060 7416 2 rooms. With fan, bath:\n" +
                "Rp. 100 000. With aircon, bath: Rp. 250.000.\n" +
                "Free drinking water.\n" +
                "\n" +
                "Beringin Bungalow. Tel: 0852 7780 8024. 5\n" +
                "rooms. Fan, outside bath or with bath: Rp.\n" +
                "100-150.000.\n" +
                "\n" +
                "BALEK GUNUNG - Iboih\n" +
                "\n" +
                "The Pade Dive Resort. Tel: 0652-3322\n" +
                "4500, 0652-332400, sabang@thepade.com\n" +
                "www.thepade.com. 13 rooms, aircon, bath,\n" +
                "hot water: Rp. 950-1.200.000, incl. breakfast\n" +
                "and tax. WiFi.\n" +
                "\n" +
                "SUMUR TIGA - Ie Meulee\n" +
                "\n" +
                "Freddie's Santai Sumur Tiga, Pantai\n" +
                "Sumur Tiga, Iemeulee. Tel: 0813 6025\n" +
                "5001, santaisumurtiga@yahoo.com.au\n" +
                "www.santai-sabang.com 9 bungalows\n" +
                "and 3 family rooms. With fan and bathroom,\n" +
                "hot water: Rp. 240-300.000. Complete\n" +
                "international restaurant and an ala carte\n" +
                "restaurant on the beach. Access to meeting\n" +
                "room for 60 persons. Wi-FI. Booking\n" +
                "needed.\n" +
                "\n" +
                "Casa Nemo, Pantai Sumur Tiga, Iemeulee.\n" +
                "T e l : 0 8 1 3 6 2 9 9 9 9 4 2 .\n" +
                "casanemo@yahoo.com www.casanemo.com\n" +
                "8 bungalows w fan, bath: Rp. 230-295.000.\n" +
                "Complete Indonesiam buffet style\n" +
                "restaurant. Booking needed. Wifi.\n" +
                "\n" +
                "Monle, Jl. K.H. Agus Salim, Ie Meulee. Tel:\n" +
                "0853 7180 8274. 5 rooms. \n" +
                "and outside bath: Rp. 100-200.000.\n" +
                "\n" +
                "Perdana Beach. Jl. K.H. Agus Salim, Ie\n" +
                "Meulee. Tel: 0852 6207 1939. 20 rooms\n" +
                "with bath, aircon, TV. Rp. 200.000.\n" +
                "\n" +
                "The Point Sabang Resort, Jl. K.H. Agus\n" +
                "Salim, Ie Meulee. Tel: 0652-22433, 0821\n" +
                "6 4 8 3 5 8 7 9 ( M r . C h a n d r a ) ,\n" +
                "t h e p o i n t s a b a n g r e s o r t @ g m a i l . c o m\n" +
                "www.thepoint.sumatraecotourism.com 39\n" +
                "bungalows/rooms.With aircon, bath, hot\n" +
                "water, TV, seaview: Rp. 420.000. Family\n" +
                "suite: Rp. 720-850.000. Excl. tax. Incl.\n" +
                "breakfast\n" +
                "\n" +
                "Ujung Kareng Conference Center, Ujung\n" +
                "Kareung. Tel: 0813 6025 5001. Managed\n" +
                "by Freddie's Santai Sumur Tiga. Fully\n" +
                "equipped and serviced. Capacity 60\n" +
                "persons. 6 rooms. With fan, bath: Rp.\n" +
                "200.000.\n" +
                "\n" +
                "Tuna Paradise Resort, Ujung Kareung.\n" +
                "Tel: 0812 6908 0080 (Andre),\n" +
                "momde_39@yahoo.com 9 bungalows.\n" +
                "With fan and bath: Rp. 175.000. With aircon,\n" +
                "bath, TV: Rp. 350.000. Big restaurant.\n" +
                "Meeting room for 20-30 persons. Small\n" +
                "private beach\n" +
                "\n" +
                "Rasa Seni Hotel Resort, Anoi Itam. Tel:0652-7010245, 0813 9685 8460,\n" +
                "www.rasaseniresort.com 10 rooms. With\n" +
                "aircon, bath, hot water: Rp. 450-800.000,\n" +
                "incl. tax and incl. breakfast.\n" +
                "\n" +
                "Anoi Itam Resort\n" +
                "Anoi Itam, Popular called Thomas Bungalow\n" +
                "Chinese Design, Tel. 082369266557 (Asin)\n" +
                "Thomas 081362541234\n");

        listhotel.setMovementMethod(new ScrollingMovementMethod());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cari_hotel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void doBack(View view) {
        Intent intent = new Intent(this, JelajahTurisActivity.class);
        startActivity(intent);
    }
}
