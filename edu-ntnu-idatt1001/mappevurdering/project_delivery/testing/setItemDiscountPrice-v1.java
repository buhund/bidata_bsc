    public void setItemDiscountPrice() {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<Item> discountedItems;
        System.out.println("Input Item ID Number for the item you wish to change price: ");
        String itemID = scanner1.nextLine();
        int preDiscountPrice = productRegister.searchForItemIDNumber(itemID).getItemPrice();
        System.out.println("Current price for item " + itemID + ": " + preDiscountPrice);

        int discountMenu = -1;
        System.out.println("Apply discount by percentage or by numerical value: ");
        System.out.println("1: Percent");
        System.out.println("2: Numerical");
        System.out.println("0: Return to main menu.");
        try {
            discountMenu = Integer.parseInt(scanner1.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Please input a valid menu option.");
        }
        try {
            switch (discountMenu) {
                case 1: // Percentage off.
                    System.out.println("Input discount percentage (whole number): ");
                    int discountPercentInput = Integer.parseInt(scanner1.nextLine());
                    int newDiscountedPricePct = (int)(preDiscountPrice * ((100.0 - discountPercentInput) / 100.0)); // Cast double inside () to int
                    productRegister.updateItemPrice(itemID, newDiscountedPricePct);

                    System.out.println("Original price: " + preDiscountPrice);
                    System.out.println("Reduced by: " + discountPercentInput + "%");
                    System.out.println("New, discounted price: " + newDiscountedPricePct);
                    break;

                case 2: // Flat numerical value off.
                    System.out.println("Input discount amount (whole number): ");
                    int discountNumValue = Integer.parseInt(scanner1.nextLine());
                    int newDiscountedPriceNumValue = (preDiscountPrice - discountNumValue);
                    productRegister.updateItemPrice(itemID, newDiscountedPriceNumValue);

                    System.out.println("Original price: " + preDiscountPrice);
                    System.out.println("Reduced by: " + discountNumValue);
                    System.out.println("New, discounted price: " + newDiscountedPriceNumValue);
                    break;

                case 0:
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println("Error. Please select a valid input option.");
                    break;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Please input a valid menu option.");
        }
    }
