        public boolean addNewItem(String itemIDNumber, String description, int itemPrice, String brandName, double weight, double length, double height, double width, String color, int itemsOnShelf, int itemCategory) {
        Item newItem = new Item(itemIDNumber, description, itemPrice, brandName, weight, length, height, width, color, itemsOnShelf, itemCategory);

        if (!checkForDuplicate(itemIDNumber.hashCode())) { // if NOT true
            inventoryOfItems.add(newItem); // then add
            return true; // No duplicate found -> Add to register
        } else { // if true --> dont add
            return false; // Duplicate found -> Do not add to register.
        }
    }




    public boolean checkForDuplicate(int checkItemID) {
        for (int i = 0; i < getInventoryOfItems().size(); i++) {
            if (getInventoryOfItems().get(i).getItemIDNumber().hashCode() == checkItemID)
                return true;
        }
        return false;
    }
