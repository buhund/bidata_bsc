    /**
     * Update number of items in stock for a given Item.
     * Identify Item by "Item ID Number" to update.
     */
    public void updateStockForItem() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input ID Number of item you wish to update stock for.");
        System.out.println("The Item ID must be an exact match. Use the item search, if unsure it item ID.");

        try {
            String itemID = scanner1.nextLine();
            int currentStock = productRegister.searchForItemIDNumber(itemID).getItemsOnShelf();

            System.out.println("Current stock/status for item " + itemID + ": " + currentStock);

            System.out.println("Select action:");
            System.out.println("1: Add to current stock.");
            System.out.println("2: Subtract from current stock.");
            System.out.println("3: Set new stock total, i.e. overwrite previous stock.");
            System.out.println("0: Exi0t to main menu.");

            int updateMenuSelector = -1;

            try {
                updateMenuSelector = Integer.parseInt(scanner1.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Please input a valid menu option.");
            }
                switch (updateMenuSelector) {
                    case 1: // Add to stock.
                        System.out.println("Input the number to be added to current stock.");
                        int addToShelf = Integer.parseInt(scanner1.nextLine());
                        if (addToShelf < 0) {
                            throw new IllegalArgumentException("Input absolute value (positive).");
                        } else {
                            int newStock = currentStock + addToShelf;
                            productRegister.updateItemOnShelf(itemID, newStock);
                            System.out.println("Confirming new stock: " + productRegister.searchForItemIDNumber(itemID).getItemsOnShelf());
                        }
                        break;

                    case 2: // Subtract from stock.
                        System.out.println("Input the number to be subtracted from stock.");
                        int subtractFromShelf = Integer.parseInt(scanner1.nextLine());
                        if (subtractFromShelf < 0) {
                            throw new IllegalArgumentException("Input absolute value (positive).");
                        } else {
                            int newStock = currentStock - subtractFromShelf;
                            productRegister.updateItemOnShelf(itemID, newStock);
                            System.out.println("Confirming new stock: " + productRegister.searchForItemIDNumber(itemID).getItemsOnShelf());
                        }
                        break;

                    case 3: // Set new total, i.e. overwrite old.
                        System.out.println("Input new total stock on shelf for item " + itemID);
                        int newTotal = Integer.parseInt(scanner1.nextLine());
                        productRegister.searchForItemIDNumber(itemID).setItemsOnShelf(newTotal);
                        System.out.println("Confirming new stock: " + productRegister.searchForItemIDNumber(itemID).getItemsOnShelf());
                        break;
                    case 0:
                        System.out.println("Returning to main menu.");
                        break;
                    default:
                        System.out.println("Error. Please select a valid input option.");
                        break;
                }
        } catch (Exception exception){
            System.out.println("Exception occurred. Please check your inputs.");
            System.out.println(exception.getMessage());
        }
        //finally {}
    }
