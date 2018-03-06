package my.spring.Project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import my.spring.model.Desktop;
import my.spring.model.Headphone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Desktop desktop1 = new Desktop(
        		"Acer", 
        		"Acer Aspire Desktop, 7th Gen Intel Core i3-7100, 8GB DDR4, 1TB HDD, Windows 10 Home, TC-780-ACKi3", 
        		10,
        		349.99, 
        		"6.89 x 17.43 x 15.67 in", 
        		"files/Acer_Aspire_Desktop,_7th_Gen_Intel_Core_i3-7100,_8GB_DDR4,_1TB_HDD,_Windows_10_Home,_TC-780-ACKi3.jpg",
        		"18.43 lbs", 
        		"Acer Aspire TC-780-ACKi3 Desktop PC comes with these specs: "
        		+ "7th Generation Intel Core i3-7100 processor (3.9GHz), Windows 10 Home, "
        		+ "8GB DDR4 2400MHz Memory, Intel HD Graphics 630, 8X DVD-Writer Double-Layer Drive (DVD-RW), "
        		+ "1TB 7200RPM SATA3 Hard Drive, Digital Media Card Reader -Secure Digital (SD) Card, "
        		+ "High Definition Audio with 5.1-Channel Audio Support, 3 - USB 3.0 Ports, "
        		+ "4 - USB 2.0 Ports, 1 - HDMI Port, 1 - VGA Port, Gigabit Ethernet, 8"
        		+ "02.11ac Wi-Fi, Bluetooth 4.0 LE, USB Keyboard and Mouse, 18.43 lbs. | 8.36 kg (system unit only), "
        		+ "1 Year Parts and Labor Limited Warranty with Toll Free Tech Support (DT.B89AA.024).",
    			"Intel Core i3 3.9GHz", 
    			"8 GB",
    			"1,000 GB", 
    			"HDD", 
    			"Windows 10 Home"
    			) ;
        session.save(desktop1);
        
        
        Desktop desktop2 = new Desktop(
        		"Acer", 
        		"Acer Aspire Desktop, 7th Gen Intel Core i5-7400, 12GB DDR4, 2TB HDD, Windows 10 Home, TC-780-ACKI5", 
        		10,
        		499.99, 
    			"6.89 x 17.43 x 15.67 in", 
    			"files/Acer_Aspire_Desktop,_7th_Gen_Intel_Core_i5-7400,_12GB_DDR4,_2TB_HDD,_Windows_10 Home,_TC-780-ACKI5.jpg", 
    			"18.43 lbs", 
    			"Acer Aspire TC-780-ACKI5 Desktop PC comes with these specs: "
    			+ "7th Generation Intel Core i5-7400 processor (Up to 3.5GHz), "
    			+ "Windows 10 Home, 12GB DDR4 2400MHz Memory, Intel HD Graphics 630, "
    			+ "8X DVD-Writer Double-Layer Drive (DVD-RW), 2TB 7200RPM SATA3 Hard Drive, "
    			+ "Digital Media Card Reader -Secure Digital (SD) Card, "
    			+ "High Definition Audio with 5.1-Channel Audio Support, 3 - USB 3.0 Ports, 4 - USB 2.0 Ports, "
    			+ "1 - HDMI Port, 1 - VGA Port, Gigabit Ethernet, 802.11ac WiFi, Bluetooth 4.0 LE, "
    			+ "USB Keyboard and Mouse, 18.43 lbs. | 8.36 kg (system unit only), "
    			+ "1 Year Parts and Labor Limited Warranty with Toll Free Tech Support (DT.B89AA.033)",
    			"Intel Core i5 3GHz", 
    			"12 GB",
    			"2,000 GB", 
    			"HDD", 
    			"Windows 10 Home"); 
        session.save(desktop2);
        
        Desktop desktop3 = new Desktop(
        		"Asus", 
        		"2017 Newest Asus G11 Premium Gaming Desktop Computer, Intel Quad-Core i7-6700 up to 4GHz, 16GB DDR4, 512GB SSD+2TB HDD, NVIDIA GeForce GTX 980 graphics, HDMI, USB 3.1, 802.11ac, Windows 10 Home 64 bit", 
        		5,
        		1469.00, 
    			"17.32 x 17.4 x 6.92 in", 
    			"files/Asus_G11_Premium_Gaming_Desktop_Computer.jpg", 
    			"21.56 lbs", 
    			"NVIDIA GeForce GTX 980; 4 GB; Dedicated;\n" + 
    			"Intel Core i7-6700 3.40GHz Quad-Core Max Turbo 4.00GHz;\n" + 
    			"16GB DDR4 SDRAM Max memory 32GB;512GB SSD + 2TB HDD; DVD±RW;\n" + 
    			"Keyboard and Mouse; LAN Gigabit Ethernet; WLAN 802.11ac;4x USB 2.0; 6x USB 3.0; 1x HDMI-Out; 1x VGA(D-Sub)-Out; 1x 7.1 Channel Audio; 1x Media card reader 1 x RJ-45;\n" + 
    			"Windows 10 brings back the Start Menu from Windows 7 and introduces new features, like the Edge Web browser that lets you markup Web pages on your screen.",
    			"Intel Core i7 4GHz", 
    			"16 GB",
    			"512 GB + 2 TB", 
    			"SSD + HDD", 
    			"Windows 10 64-bit");
        session.save(desktop3);
        
        Headphone headphone1 = new Headphone(
        		"Sony", 
        		"Sony MDR-Z700DJ Headphones", 
        		5,
    			674.15,
    			"9.2 x 7.4 x 3.8 inches", 
    			"files/Sony_MDR-Z700_Headphones.jpg", 
    			"0.66 lbs", 
    			"Reversible swivel earcups for DJ and remix single-sided monitoring, and an auto return swivel mechanism\n" + 
    			"Supra-aural design ensures excellent comfort and creates controlled environment for better sound\n" + 
    			"Huge, 50 mm drivers deliver deep bass down to 5 hz and provide outstanding dynamic range\n" + 
    			"3,000 mW power handling for the most stringent professional applications and daily use at very high output levels\n" + 
    			"Frequency response: 5 to 30,000 Hz",
    			"Over-Ear", 
    			"wire", 
    			"deep bass"); 
        session.save(headphone1);
        
        Headphone headphone2 = new Headphone(
        		"Audio-Technica", 
        		"Audio-Technica ATH-WS1100iS Solid Bass Over-Ear Headphones with In-line Microphone & Control", 
        		5,
    			229.00, 
    			"5 x 11 x 8 in", 
    			"files/Audio_Technica_ATH_WS1100iS_Solid_Bass_Over-Ear_Headphones_with_In-_line_Microphone_&_Control.jpg", 
    			"1.3 lbs", 
    			"With newly designed drivers and in-line mic and control, "
    			+ "the ATH-WS1100iS Solid Bass over-ear headphones give you portable, "
    			+ "smartphone-compatible headphones with Hi-Res Audio reproduction and truly deep bass. "
    			+ "The 53 mm Deep Motion Drivers, designed exclusively for the ATH-WS1100iS, "
    			+ "feature an ultra-powerful magnetic circuit that works to "
    			+ "deliver highly accurate audio with a wide frequency response, "
    			+ "while the large diaphragm surface area of the drivers causes considerable air movement, "
    			+ "helping to produce a rich, textured bass sound. The rigid housings of the ATH-WS1100iS, "
    			+ "which incorporate Audio-Technica's new Extra Bass Venting System, "
    			+ "also contribute to the headphones' audio clarity. "
    			+ "Each housing features an aluminum stabilizer ring that helps produce clear mid-to-high frequencies. "
    			+ "Vents, including extra side vents not found in other models that utilize the Bass Venting System, "
    			+ "are positioned for optimal control of air movement inside the housings, "
    			+ "aiding in the reproduction of high-fidelity bass sound. "
    			+ "Exclusive dual-layer earpads, comprised of a firm internal layer and a soft outer layer, "
    			+ "provide excellent sound isolation with amazing comfort. "
    			+ "The detachable 1.2 m (3. 9') cable includes an in-line mic and control that lets you answer calls "
    			+ "and handle media playback on your smartphone or other portable device. "
    			+ "A convenient carrying pouch is also included.",
    			"Over-Ear", 
    			"Wire", 
    			"—"); 
        session.save(headphone2);
        
        Headphone headphone3 = new Headphone(
        		"Sennheiser", 
        		"Sennheiser HD 600 Open Back Professional Headphone", 
        		10,
    			286.00, 
    			"0.39 x 0.39 x 0.39 in", 
    			"files/Sennheiser_HD_600_Open_Back_Professional_Headphone.jpg", 
    			"0.57 lb", 
    			"Sound-wise, when others settle for hamburger, do you demand filet mignon? You should never have to compromise when it comes to tracking, monitoring, mixing, and listening in general. That's why Sennheiser makes the choicest cut of headphones you're going to encounter: the HD 600. These super-accurate open-back 'phones are also ultra-comfortable, so you can wear them over long listening sessions. You get quality in every component, from the magnets and voice coils to the comfy headband and the Kevlar-reinforced detachable cable. If you're hungry for premium sound, these 'phones are sure to satisfy!",
    			"Over-Ear", 
    			"wire", 
    			"lightweight");
        
        session.save(headphone3);
        
       Headphone headphone4 = new Headphone(
    		   "Sennheiser", 
    		   "Sennheiser HD 700 Headphone (Jack plug ¼\" (6.3 mm) stereo)", 
    		   2,
    		   449.00, 
    		   "5 x 8 x 10 in", 
    		   "files/Sennheiser_HD_700_Headphone.jpg", 
    		   "0.9 lbs", 
    		   "If the HD 700 headphones were a music group, it would be equally gifted in every style. Whether classic, jazz or rock, it would have sound mastery of each genre. Regardless of what song it’s currently playing, its timbre is always warm and emotional. With its exceptional and unique range, reproduction of the lowest and highest tones that the human ear cannot consciously perceive is now achievable. This is a true maestro and an unforgettable listening experience suited for every musical taste.",
    		   "Over-Ear", 
    		   "wire", 
    		   "tangle-free-cord");
       session.save(headphone4); 
       
        tx.commit();
  
        session.close();
        sf.close();
    }
}
