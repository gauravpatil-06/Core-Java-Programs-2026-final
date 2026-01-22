package com.gaurav.project;

import java.util.Scanner;

public class EcommerceApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // User Data
        double walletBalance = 150000;
        int stock = 50; 

        // Variables
        int categoryChoice, productChoice, quantity;
        String productName = "";
        double productPrice = 0;
        boolean isValidSelection = false;

        while (true) 
        {
            // Reset validation
            isValidSelection = false; 

            System.out.println("\n=======================================");
            System.out.println("         🛒 E-COMMERCE STORE");
            System.out.println("=======================================");
            System.out.println(" 💰 Wallet Balance : ₹" + walletBalance);
            System.out.println(" 📦 Stock Available: " + stock);
            System.out.println("---------------------------------------");
            System.out.println(" 1. Smartphones");
            System.out.println(" 2. Laptops");
            System.out.println(" 3. Tablets");
            System.out.println(" 4. Gaming Consoles");
            System.out.println(" 5. Headphones & Audio");
            System.out.println(" 6. Smartwatches");
            System.out.println(" 7. Cameras");
            System.out.println(" 8. Smart TV & Home");
            System.out.println(" 9. Computer Accessories");
            System.out.println(" 10. Power Banks & Chargers");
            System.out.println(" 0. Exit");
            System.out.println("---------------------------------------");
            System.out.print("👉 Select Category: ");
            
            // Input Validation Logic
            if(sc.hasNextInt()) 
            {
                categoryChoice = sc.nextInt();
            } 
            else 
            {
                sc.next(); // Clear invalid input
                continue;
            }

            // Exit Condition
            if (categoryChoice == 0) 
            {
                System.out.println("\n🙏 Thank you for shopping with us!");
                break;
            }

            /* ================= NESTED IF - CATEGORY SELECTION ================= */
            
            // Category 1: Smartphones
            if (categoryChoice == 1) 
            {
                System.out.println("\n--- 📱 Smartphones ---");
                System.out.println("1. Apple iPhone 15    - ₹79999");
                System.out.println("2. Samsung Galaxy S23 - ₹74999");
                System.out.println("3. OnePlus 11R        - ₹39999");
                System.out.println("4. iQOO Neo 7 Pro     - ₹34999");
                System.out.println("5. Redmi Note 13 Pro  - ₹18999");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Apple iPhone 15"; 
                    productPrice = 79999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Samsung Galaxy S23"; 
                    productPrice = 74999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "OnePlus 11R"; 
                    productPrice = 39999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "iQOO Neo 7 Pro"; 
                    productPrice = 34999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "Redmi Note 13 Pro"; 
                    productPrice = 18999; 
                    isValidSelection = true; 
                }
            }

            // Category 2: Laptops
            else if (categoryChoice == 2) 
            {
                System.out.println("\n--- 💻 Laptops ---");
                System.out.println("1. MacBook Air M1     - ₹89999");
                System.out.println("2. Dell XPS 13        - ₹98000");
                System.out.println("3. HP Pavilion        - ₹48990");
                System.out.println("4. Lenovo IdeaPad     - ₹42999");
                System.out.println("5. ASUS VivoBook 15   - ₹39999");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "MacBook Air M1"; 
                    productPrice = 89999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Dell XPS 13"; 
                    productPrice = 98000; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "HP Pavilion"; 
                    productPrice = 48990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "Lenovo IdeaPad"; 
                    productPrice = 42999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "ASUS VivoBook 15"; 
                    productPrice = 39999; 
                    isValidSelection = true; 
                }
            }

            // Category 3: Tablets
            else if (categoryChoice == 3) 
            {
                System.out.println("\n--- 📟 Tablets ---");
                System.out.println("1. Samsung Tab S9     - ₹61999");
                System.out.println("2. Apple iPad 10th    - ₹44900");
                System.out.println("3. Lenovo Tab P11     - ₹24999");
                System.out.println("4. Xiaomi Pad 6       - ₹26999");
                System.out.println("5. Realme Pad X       - ₹19999");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Samsung Tab S9"; 
                    productPrice = 61999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Apple iPad 10th"; 
                    productPrice = 44900; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "Lenovo Tab P11"; 
                    productPrice = 24999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "Xiaomi Pad 6"; 
                    productPrice = 26999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "Realme Pad X"; 
                    productPrice = 19999; 
                    isValidSelection = true; 
                }
            }

            // Category 4: Gaming Consoles
            else if (categoryChoice == 4) 
            {
                System.out.println("\n--- 🎮 Gaming ---");
                System.out.println("1. Sony PS5           - ₹54990");
                System.out.println("2. Xbox Series S      - ₹34990");
                System.out.println("3. PS5 Controller     - ₹5999");
                System.out.println("4. Gaming Keyboard    - ₹3499");
                System.out.println("5. Wired Gamepad      - ₹1499");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Sony PS5"; 
                    productPrice = 54990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Xbox Series S"; 
                    productPrice = 34990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "PS5 Controller"; 
                    productPrice = 5999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "Gaming Keyboard"; 
                    productPrice = 3499; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "Wired Gamepad"; 
                    productPrice = 1499; 
                    isValidSelection = true; 
                }
            }

            // Category 5: Headphones
            else if (categoryChoice == 5) 
            {
                System.out.println("\n--- 🎧 Headphones ---");
                System.out.println("1. Sony WH-1000XM5    - ₹29990");
                System.out.println("2. JBL Tune 760NC     - ₹6999");
                System.out.println("3. Boat Rockerz 550   - ₹1999");
                System.out.println("4. AirPods Pro 2      - ₹24999");
                System.out.println("5. OnePlus Bullets    - ₹1799");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Sony WH-1000XM5"; 
                    productPrice = 29990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "JBL Tune 760NC"; 
                    productPrice = 6999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "Boat Rockerz 550"; 
                    productPrice = 1999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "AirPods Pro 2"; 
                    productPrice = 24999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "OnePlus Bullets"; 
                    productPrice = 1799; 
                    isValidSelection = true; 
                }
            }

            // Category 6: Smartwatches
            else if (categoryChoice == 6) 
            {
                System.out.println("\n--- ⌚ Smartwatches ---");
                System.out.println("1. Apple Watch S9     - ₹41900");
                System.out.println("2. Samsung Watch 6    - ₹29999");
                System.out.println("3. Noise ColorFit     - ₹2999");
                System.out.println("4. Boat Xtend         - ₹1999");
                System.out.println("5. Fire-Boltt Ninja   - ₹1499");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Apple Watch S9"; 
                    productPrice = 41900; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Samsung Watch 6"; 
                    productPrice = 29999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "Noise ColorFit"; 
                    productPrice = 2999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "Boat Xtend"; 
                    productPrice = 1999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "Fire-Boltt Ninja"; 
                    productPrice = 1499; 
                    isValidSelection = true; 
                }
            }

            // Category 7: Cameras
            else if (categoryChoice == 7) 
            {
                System.out.println("\n--- 📷 Cameras ---");
                System.out.println("1. Sony Alpha A7 III  - ₹156000");
                System.out.println("2. Canon EOS 1500D    - ₹41990");
                System.out.println("3. GoPro Hero 12      - ₹39990");
                System.out.println("4. Fujifilm Instax    - ₹5999");
                System.out.println("5. Tripod Stand       - ₹1500");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Sony Alpha A7"; 
                    productPrice = 156000; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Canon EOS 1500D"; 
                    productPrice = 41990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "GoPro Hero 12"; 
                    productPrice = 39990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "Fujifilm Instax"; 
                    productPrice = 5999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "Tripod Stand"; 
                    productPrice = 1500; 
                    isValidSelection = true; 
                }
            }

            // Category 8: TV & Home
            else if (categoryChoice == 8) 
            {
                System.out.println("\n--- 📺 TV & Home ---");
                System.out.println("1. Sony Bravia 55'    - ₹64990");
                System.out.println("2. Samsung 4K TV      - ₹45990");
                System.out.println("3. Amazon FireStick   - ₹3999");
                System.out.println("4. Google Chromecast  - ₹3499");
                System.out.println("5. Mi Smart Bulb      - ₹499");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Sony Bravia 55'"; 
                    productPrice = 64990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Samsung 4K TV"; 
                    productPrice = 45990; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "Amazon FireStick"; 
                    productPrice = 3999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "Google Chromecast"; 
                    productPrice = 3499; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "Mi Smart Bulb"; 
                    productPrice = 499; 
                    isValidSelection = true; 
                }
            }

            // Category 9: Computer Accessories
            else if (categoryChoice == 9) 
            {
                System.out.println("\n--- 🖱️ Accessories ---");
                System.out.println("1. Logitech MX Master - ₹9995");
                System.out.println("2. Mechanical Keybrd  - ₹4500");
                System.out.println("3. 1TB SSD External   - ₹8500");
                System.out.println("4. WiFi Router        - ₹2500");
                System.out.println("5. 64GB Pen Drive     - ₹600");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Logitech MX Master"; 
                    productPrice = 9995; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Mechanical Keybrd"; 
                    productPrice = 4500; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "1TB SSD External"; 
                    productPrice = 8500; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "WiFi Router"; 
                    productPrice = 2500; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "64GB Pen Drive"; 
                    productPrice = 600; 
                    isValidSelection = true; 
                }
            }

            // Category 10: Power & Chargers
            else if (categoryChoice == 10) 
            {
                System.out.println("\n--- 🔋 Power ---");
                System.out.println("1. Apple 20W Adapter  - ₹1900");
                System.out.println("2. Mi 20000mAh Bank   - ₹2149");
                System.out.println("3. Anker USB-C Cable  - ₹999");
                System.out.println("4. Samsung Wireless   - ₹3999");
                System.out.println("5. Extension Cord     - ₹499");
                System.out.print("👉 Select Product: ");
                productChoice = sc.nextInt();

                if (productChoice == 1) 
                { 
                    productName = "Apple 20W Adapter"; 
                    productPrice = 1900; 
                    isValidSelection = true; 
                }
                else if (productChoice == 2) 
                { 
                    productName = "Mi 20000mAh Bank"; 
                    productPrice = 2149; 
                    isValidSelection = true; 
                }
                else if (productChoice == 3) 
                { 
                    productName = "Anker USB-C Cable"; 
                    productPrice = 999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 4) 
                { 
                    productName = "Samsung Wireless"; 
                    productPrice = 3999; 
                    isValidSelection = true; 
                }
                else if (productChoice == 5) 
                { 
                    productName = "Extension Cord"; 
                    productPrice = 499; 
                    isValidSelection = true; 
                }
            }

            // Invalid Category
            else 
            {
                System.out.println("\n❌ Invalid Category Selection!");
                continue;
            }

            /* ================= VALIDATION CHECK ================= */
            if (!isValidSelection) 
            {
                System.out.println("\n❌ Invalid Product Selection!");
                continue;
            }

            /* ================= BUY FLOW (NESTED IF LOGIC) ================= */
            System.out.print("👉 Enter Quantity: ");
            
            if(sc.hasNextInt()) 
            {
                quantity = sc.nextInt();
            } 
            else 
            {
                sc.next(); 
                System.out.println("❌ Invalid Number"); 
                continue;
            }

            // Nested If for Quantity Check
            if (quantity <= 0) 
            {
                System.out.println("❌ Invalid Quantity");
                continue;
            }
            // Nested If for Stock Check
            if (quantity > stock) 
            {
                System.out.println("❌ Out of Stock! Only " + stock + " items available.");
                continue;
            }

            // Calculation
            double totalPrice = productPrice * quantity;
            double discount = 0;

            // Nested If for Discount
            if (totalPrice >= 10000) 
            {
                discount = totalPrice * 0.10;
            }
            else if (totalPrice >= 5000) 
            {
                discount = totalPrice * 0.05;
            }
            else if (totalPrice >= 2000) 
            {
                discount = totalPrice * 0.02;
            }

            double finalPrice = totalPrice - discount;

            // Nested If for Balance Check
            if (walletBalance >= finalPrice) 
            {
                walletBalance -= finalPrice;
                stock -= quantity; 

                /* -------- FINAL RECEIPT -------- */
                System.out.println("\n=======================================");
                System.out.println("           ✅ PURCHASE RECEIPT");
                System.out.println("=======================================");
                System.out.printf(" Product Name : %s\n", productName);
                System.out.printf(" Unit Price   : ₹%.2f\n", productPrice);
                System.out.printf(" Quantity     : %d\n", quantity);
                System.out.println("---------------------------------------");
                System.out.printf(" Total Price  : ₹%.2f\n", totalPrice);
                System.out.printf(" Discount     : -₹%.2f\n", discount);
                System.out.println("---------------------------------------");
                System.out.printf(" FINAL PAY    : ₹%.2f\n", finalPrice);
                System.out.println("---------------------------------------");
                System.out.printf(" Balance Left : ₹%.2f\n", walletBalance);
                System.out.println("=======================================");
                
                // Wait
                System.out.println("\n(Press ENTER to continue shopping...)");
                sc.nextLine(); 
                sc.nextLine(); 
            } 
            else 
            {
                // Insufficient Balance (Red Color)
                System.err.println("\n❌ Insufficient Wallet Balance!");
                System.err.println("Required: ₹" + finalPrice);
                System.err.println("Available: ₹" + walletBalance);
                
                try 
                { 
                    Thread.sleep(100); 
                } 
                catch(Exception e)
                {
                    // Ignored
                } 
                
                System.out.println("\n(Press ENTER to go back...)");
                sc.nextLine(); 
                sc.nextLine();
            }
        }
    }
}