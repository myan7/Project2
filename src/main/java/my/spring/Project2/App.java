package my.spring.Project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import my.spring.model.Clothing;
import my.spring.model.Desktop;
import my.spring.model.Headphone;
import my.spring.model.Laptop;
import my.spring.model.Book;

/**
 * Hello world!
 *
 */
public class App {
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
       
       Book p1 = new Book(
    		   "A Brief History of Time", 
    		   "A Brief History of Time", 
    		   200,
    		   21.01, 
    		   "5.9 x 0.7 x 9 inches", 
    		   "files/ABriefHistoryOfTime.jpg", 
    		   "11.4 ounces", 
    		   "A landmark volume in science writing by one of the great minds of our time, Stephen Hawking’s book explores such profound questions as: How did the universe begin—and what made its start possible? Does time always flow forward? Is the universe unending—or are there boundaries? Are there other dimensions in space? What will happen when it all ends?",
    		   "Stephen Hawking", 
    		   "1998", 
    		   "Hard cover");
       session.save(p1);
       
       Book p2 = new Book(
    		   "1985", 
    		   "1985", 
    		   100,
   			20.46, 
   			"8.4 x 5.8 x 1.2 inches", 
   			"files/1985.jpg", 
   			"1.2 pounds", 
   			"This two-part response to 1984 minutely analyzes the original novel, and, after Burgess decides that 1984 will not resemble Orwell's fantasy, creates a comic counter-novel of future Britain",
   			"Anthony Burgess", 
   			"1978", 
   			"Paper back");
       session.save(p2);
       
       Book p3 = new Book(
    		   "Charlotte's Web", 
    		   "Charlotte's Web",  
    		   50,
   			6.29, 
   			"5.2 x 0.8 x 8.2 inches", 
   			"files/CharlotsWeb.jpg", 
   			"8.8 ounces", 
   			"This beloved book by E. B. White, author of Stuart Little and The Trumpet of the Swan, is a classic of children's literature that is \"just about perfect.\" This paper-over-board edition includes a foreword by two-time Newbery winning author Kate DiCamillo.",
   			"E. B. White", 
   			"2012", 
   			"Kindle");
       session.save(p3);
       
       Book p4 = new Book(
    		   "The Book Thief", 
    		   "The Book Thief",  
    		   20,
   			13.99, 
   			"5.1 x 1.2 x 8 inches", 
   			"files/TheBookThief.jpg", 
   			"15.2 ounces", 
   			"The extraordinary #1 New York Times bestseller that is now a major motion picture, Markus Zusak's unforgettable story is about the ability of books to feed the soul.\n" + 
   			"\n" + 
   			"It is 1939. Nazi Germany. The country is holding its breath. Death has never been busier, and will become busier still.",
   			"Markus Zusak", 
   			"2007", 
   			"Hard cover");
       session.save(p4);
       
       Book p5 = new Book(
    		   "42 Faith: The Rest of the Jackie Robinson Story", 
    		   "42 Faith: The Rest of the Jackie Robinson Story", 
    		   20,
   			16.84, 
   			"6.2 x 1.2 x 9.3 inches", 
   			"files/42.jpg", 
   			"1 pounds", 
   			"Journalist and baseball lover Ed Henry reveals for the first time the backstory of faith that guided Jackie Robinson into not only the baseball record books but the annals of civil rights advancement as well. Through recently discovered sermons, interviews with Robinson’s family and friends, and even an unpublished book by the player himself, Henry details a side of Jackie’s humanity that few have taken the time to see.",
   			"Ed Henry", 
   			"2017", 
   			"Hard cover");
       session.save(p5);
       
       Clothing c1 = new Clothing(
    		   "Vemvan", 
    		   "Vemvan Womens Long Sleeve Round Neck T Shirts Color Block Striped Causal Blouses Tops", 
    		   30, 
    		   18.99, 
    		   "	—",
			"files/Vemvan.jpg", 
			"0.3 pounds", 
			"Vemvan Womens Long Sleeve Round Neck T Shirts Color Block Striped Causal Blouses Tops\n" + 
			"\n" + 
			"Printing Chambray Designed Makes You More Fashion.\n" + 
			"\n" + 
			"Casual Tops Pair With Jeans, Leggings Or Trousers.Elegant Stripe Blouses To Show Off your Charming Curves.",
			"Medium", 
			"Black and white", 
			"Polyester", 
			"Female");
    		session.save(c1);
    		
    		Clothing c2 = new Clothing(
    	    		"HUANYOU", 
    	    		"HUANYOU Women Blouse Long Sleeve Striped Shirts V Neck Blouses Ladies Tops", 
    	    		40, 
    	    		17.99, 
      		"—",
    			"files/HUANYOU.jpg", 
    			"0.3 pounds", 
   			"It is cut fairly low. I think that it would be okay if you wore some kind of slip/cute tank underneath with lace chest or something, but probably not appropriate without something underneath. On a side note, though, it is the most COMFORTABLE shirt and really looks quite nice! ", 
    			"Small", 
    			"black and white", 
   			"Spandex fabric", 
   			"Female");
    	    	session.save(c2);
    	    		
    	    		
    	    	Clothing c3 = new Clothing(
    	    	    "Ericdress", 
    	    	    "Ericdress Dashiki Color Block Dashiki V-Neck Vogue Slim Men's T-Shirt", 
    	    	    	2, 
    	    	    18.99, 
    	    	    "—",
    	    		"files/Dashiki.jpg", 
    	    		"0.4 pounds", 
    	    		"The dashiki is a colorful garment for women and men worn mostly in West Africa . It covers the top half of the body. It has formal and informal versions and varies from simple draped clothing to fully tailored suits. A common form is a loose-fitting pullover garment, with an ornate V-shaped collar, and tailored and embroidered neck and sleeve lines. It is frequently worn with a brimless Kufi cap, which is worn in Islamic communities in Africa and the African diaspora, and a pair of pants.\n" + 
    	    		"\n" + 
    	    		"The name dashiki is derived from the Hausa word dan ciki, which means shirt.", 
    	    		"Large", 
    	    		"color block", 
    	    		"Polyester", 
    	    		"Uni sex");
    	    session.save(c3);
    	    	    		
    	    Clothing c4 = new Clothing(
    	    		"Marvel", 
    	    		"Black panther costume", 
    	    	   	20, 
    	    	  	999.99, 
    	    	   	"—",
    	    	    	"files/BlackPanther.jpg", 
    	    	    	"5 lbs", 
    	    	    	"Black Panther's real name is T'Challa, king and protector of the fictional African nation of Wakanda. Along with possessing enhanced abilities achieved through ancient Wakandan rituals of drinking the heart shaped herb, T'Challa also relies on his proficiency in science, rigorous physical training, hand-to-hand combat skills, and access to wealth and advanced technology to combat his enemies.", 
    	    	    	"Large", 
    	    	    	"Black", 
    	    	    	"vibranium", 
    	    	    	"Male");
    	    session.save(c4);
    	    
        
        Laptop l1 = new Laptop(
        		"Lenovo", 
        		"Lenovo ThinkPad X1 Carbon Laptop Computer 14\" FHD IPS Screen, Intel Dual Core i7-6500U, 8GB RAM, 256GB PCIe NVMe Drive, W10P DG W7P (3 Yr WTY)", 
        		5, 
        		1329.00, 
        		"12.7 x 8.6 x 0.6 inches",
    			"files/ThinkPadX1Carbon.jpg", 
    			"2.49 pounds", 
    			"Processor: Intel i7-6500U Dual Core Processor (2.50GHz - 3.10GHz, 4MB Cache)\n" + 
    			"Operating System: Microsoft Windows 7 Pro x64 preinstalled with free upgrade to Windows 10 Pro\n" + 
    			"Features: 8GB RAM DDR3, 256GB SSD M.2 PCIe-NVMe, Fingerprint Reader, Backlit Keyboard\n" + 
    			"Display: 14\" FHD 1920x1080 IPS, LED Display; Graphics Card: Intel HD 520",
    			
    			"Intel i7-6500U Dual Core Processor (2.50GHz - 3.10GHz, 4MB Cache)", 
    			"8GB", 
    			"256GB", 
    			"SSD", 
    			"Windows 7 Pro x64", 
    			"1920x1080 pixels",
    			"14\" FHD"
        		);
        	session.save(l1);
        	
        	Laptop l2 = new Laptop(
            		"ASUS", 
            		"ASUS M580VD-EB54 VivoBook 15.6\" FHD thin and light Gaming Laptop (Intel Core i5-7300HQ, GTX 1050 2GB, 8GB DDR4, 256GB SSD), backlit keyboard", 
            		15, 
            		794.00, 
            		"10.1 x 15 x 0.8 in",
        			"files/ASUS_M580VD_EB54VivoBook.jpg", 
        			"5.1 lbs", 
        			"ASUS VivoBook M580VD-EB54 15.6\" FHD Thin and Light Gaming/Multimedia Laptop; 7th Gen Intel Core i5-7300HQ Processor 2.5GHz (Turbo up to 3.5); Discrete GeForce GTX 1050 2GB; 8GB DDR4 RAM; 256GB M.2 SSD; Illuminated Chicklet keyboard; Harman/Kardon audio; Gold & Metal Finish; Windows 10 Home (64-bit); 1920 x 1080 LED Back-lit, anti-glare screen; Dual Band 802.11ac Wi-Fi; Bluetooth 4.2; 1x USB 3.1 Type C (gen1); 1x USB 3.0; 2x USB 2.0; 1x Headphone-out & Audio-in Combo Jack; 1x HDMI1.4; SDXC Card Reader; TPM Security.",
        			"Intel Core i5-7300HQ 2.5 GHz", 
        			"8 GB", 
        			"256 GB", 
        			"SSD", 
        			"Windows 10", 
        			"1920 x 1080 pixels",
        			"15.6 in"
            		);
        	session.save(l2);
        	
        	Laptop l3 = new Laptop(
            		"HP", 
            		"2017 HP Notebook 15.6 Inch Premium Flagship High Performance Laptop Computer (Intel Core i7-7500U 2.7GHz up to 3.5GHz, 16GB RAM, 512GB SSD, DVD, WiFi, HD Webcam, Windows 10 Home) Silver", 
            		2, 
            		929.00, 
            		"15.1 x 10 x 0.9 inches",
        			"files/2017HPNotebook.jpg", 
        			"4.73 pounds", 
        			"7th Gen Intel Core i7-7500U Dual-Core processor 2.7GHz up to 3.5GHz, 4MB L3 Cache. Intel HD Graphics 620 with up to 8278 MB total graphics memory\n" + 
        			"16 GB DDR4-2133 SDRAM (2 x 8 GB) system memory, memory slot not accessible; 512GB Solid State drive ssd; Multi-Format Digital card reader, SuperMulti DVD burner to read and write DVD and CD\n" + 
        			"15.6\" diagonal HD 1366x768 SVA BrightView WLED-backlit Display; Front-facing HP TrueVision HD Webcam with integrated digital microphone; Full-size island-style keyboard with numeric keypad; Touchpad supporting multi-touch gestures without on/off button; DTS Studio Sound with dual speakers\n" + 
        			"Intel 802.11ac (1x1) and Bluetooth 4.0 Combo; 10/100 base-T Ethernet network, 1xHDMI, 1x USB 3.0 port, 2x USB 2.0 ports; 1 RJ-45 (LAN) 1 Headphone-out/microphone-in combo jack\n" + 
        			"Windows 10 home 64-bit. 4-cell 41 WHr 2.8Ah lithium-ion batter up to 8 hours of battery life ; Dimension: 15.12 x 10.02 x 0.95 in; Weighs 4.83 lb. | 1-Year UpgradePro Limited Warranty* | View description and warranty section below for more details.",
        			"Intel Core i7-7500U 2.7GHz up to 3.5GHz", 
        			"16 GB", 
        			"512 GB", 
        			"SSD", 
        			"Windows 10 Home", 
        			"1366x768 pixels",
        			"15.6 in"
            		);
        	session.save(l3);
        	
        	Laptop l4 = new Laptop(
            		"Lenovo", 
            		"2017 Lenovo ThinkPad X270 12.5 Inch Anti-Glare FHD IPS (1920x1080) Premium Flagship Laptop (Intel Core i7-7500U 2.7GHz, 16GB DDR4 RAM, 256GB SDD, Intel HD Graphics 620, WiFi, Windows 10) Black", 
            		20, 
            		1199.00, 
            		"12.03 x 8.21 x 0.8 in",
        			"files/2017LenovoThinkPadX270.jpg", 
        			"2.9 lbs", 
        			"ThinkPad X270 Laptop | 12.5\" Business Laptop: OUTSTANDING VALUE AND PERFORMANCE\n" + 
        			"Revolutionary performance, exceptional mobility and outstanding features for business. That describes the slim, light ThinkPad X270 (12.5\") notebooks. With latest generation of Intel Skylake processor, extensive memory and storage options, enhanced connectivity. Ready for business at a surprisingly affordable price!",
        			"Intel Core i7-7500U 2.7GHz", 
        			"16GB DDR4", 
        			"256GB", 
        			"SDD", 
        			"Windows 10", 
        			"1920x1080 pixels",
        			"12.5 in"
            		);
        	session.save(l4);
        	
        	Laptop l5 = new Laptop(
            		"Lenovo", 
            		"Lenovo ThinkPad P51 15.6\" Business Laptop: Intel 7th Gen i7-7700HQ | 32GB RAM | 256GB M.2 SSD + 1TB HDD | FingerPrint Reader | Windows 10 Professional", 
            		2, 
            		2099.00, 
            		"9.93 x 14.86 x 0.96 in",
        			"files/ThinkpadP51.jpg", 
        			"5.9 lbs", 
        			"ThinkPad P51 Laptop | 15\" Business Laptop: OUTSTANDING VALUE AND PERFORMANCE \n" + 
        			"Revolutionary performance, exceptional mobility and outstanding features for business. That describes the slim, light ThinkPad P51 (15.6\") notebooks. With latest generation of Intel Kaby Lake processor, extensive memory and storage options, enhanced connectivity. Ready for business at a surprisingly affordable price! ",
        			"Intel 7th Gen i7-7700HQ", 
        			"32 GB DDR4", 
        			"256GB + 1TB", 
        			"SSD + HDD", 
        			"Windows 10 Professional", 
        			"1920x1080 pixels",
        			"15.6 in"
            		);
        	session.save(l5);
        	
        	Laptop l6 = new Laptop(
            		"Dell", 
            		"2018 Newest Dell Premium Business Flagship Laptop PC 15.6\" HD LED-backlit Display Intel i3-7100U Processor 8GB DDR4 RAM 1TB HDD HDMI DVD-RW Bluetooth Webcam MaxxAudio Windows 10-Black", 
            		100, 
            		469.99, 
            		"15.02 x 10.2 x 1.19 in",
        			"files/2018NewestDellPremiumBusiness.jpg", 
        			"4.85 lbs", 
        			"Runs on Windows® 10 Home. \n" + 
        			"\n" + 
        			"15.6\" LED backlit with Truelife HD.  Lets you enjoy your favorite movies, shows and games in stunning 1366 x 768 resolution.\n" + 
        			"\n" + 
        			"Powered by Intel® i3-7100U Processor. \n" + 
        			"\n" + 
        			"8GB of memory is available to run games, programs and more. \n" + 
        			"\n" + 
        			"1TB hard drive has plenty of storage space for your documents and programs. \n" + 
        			"\n" + 
        			"Integrated Intel HD Graphics for outstanding gaming and streaming video. \n" + 
        			"\n" + 
        			"Features 1 USB 3.0 port for lightning-fast data transfers.  USB 3.0 is up to 10 times faster than USB 2.0, yet fully compatible with USB 2.0.\n" + 
        			"\n" + 
        			"Built-in memory card reader makes file transfers quick and easy.  Supports SD, SDHC and SDXC memory cards.\n" + 
        			"\n" + 
        			"Equipped with stereo speakers and MaxxAudio for clearer sound and music. \n" + 
        			"\n" + 
        			"HDMI™ port lets you view videos, photos and games right on your HDTV or larger screen.  (HDMI cable is sold separately).\n" + 
        			"\n" + 
        			"Features a built-in, front facing HD webcam and microphone.  Supports video resolutions up to 720p.\n" + 
        			"\n" + 
        			"Integrated Bluetooth® 4.0 technology.  Permits short-range wireless data transfers at up to 30' with other Bluetooth-enabled devices, including speakers, printers and phones.\n" + 
        			"\n" + 
        			"Gives you up to 8 hours of battery life.  Battery life will vary depending on the product configuration, product model, applications loaded on the product, power management setting of the product, and the product features used by the customer. As with all batteries, the maximum capacity of this battery will decrease with time and usage.",
        			"Intel i3-7100U Processor", 
        			"8G", 
        			"1 TB", 
        			"HDD", 
        			"Windows 10 Professional", 
        			"1366 x 768 pixels",
        			"15.6 in"
            		);
        	session.save(l6);
        	
        	Laptop l7 = new Laptop(
            		"Dell", 
            		"2018 Dell Inspiron 15 5000 Flagship 15.6 inch Full HD Touchscreen Backlit Keyboard Laptop PC, Intel Core i5-8250U Quad-Core, 8GB DDR4, 1TB HDD, DVD RW, Bluetooth 4.2, WIFI, Windows 10", 
            		20, 
            		565.00, 
            		"14.96 x 10.15 x 0.89 in ",
        			"files/Dell_Inspiron15 .jpg", 
        			"4.85 lbs", 
        			"Display : 15.6 in Full HD IPS TrueLife LED-backlit touchscreen (1920 x 1080), 10-finger multi-touch support; Processor: Newest 8th gen Intel Quad Core i5-8250U 6MB cache, up to 3.40 GHz; Memory: 8GB DDR4 2400 MHz; Hard drive size: 1TB 5400 RPM hard drive; Operating system: Windows 10 Home, 64-bit; Optical drive: DVD +/- RW; Media drive: 3-in-1 media card reader (SD/SDHC/SDXC); Audio: Waves MaxxAudio Pro; Video: Intel UHD Graphics 620 with shared graphics memory; Ports: 1 USB 3.1 Type-C (with PowerDelivery) , 2 USB 3.1 Gen 1 , 1 USB 2.0 ,  1 HDMI v1.4b, Headphone output/Microphone input combo, LAN (10/100/1000); Battery: 42WHr; Camera: 720p HD webcam with integrated widescreen, plus dual digital microphone array; Wireless: WIFI 802.11ac; Bluetooth: Bluetooth 4.2; Dimensions: 14.96 x 10.15 x 0.89 in (380.00 x 258.00 x 22.70 mm); Weight: 4.85 lbs (2.20 kg); Color: Silver or Matte Gray; Backlit keyboard, Precision touchpad, Security cable slot.",
        			"Intel Core i5-8250U Quad-Core 1.6GHz", 
        			"8GB DDR4", 
        			"1TB", 
        			"HDD", 
        			"Windows 10", 
        			"1920x1080 pixels",
        			"15.6 in"
            		);
        	session.save(l7);
    		
    		
        tx.commit();
  
        session.close();
        sf.close();
    }
}
