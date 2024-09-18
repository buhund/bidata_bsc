       for (int i = 0; i < getInventoryOfItems().size(); i++) {
          Item placeholderItem = getInventoryOfItems().get(i);
            if (placeholderItem.equals(newItem)) {
                throw new RuntimeException("Item already exist");
            } else {
                inventoryOfItems.add(newItem);
            }
        }




            boolean itemExist = inventoryOfItems.stream().anyMatch(c -> c.equals(newItem));
            if (itemExitsOrNot(newItem)) {
                throw new InaccessibleObjectException("Item already exist.");
            } else {
                inventoryOfItems.add(newItem);
            }



        if(!inventoryOfItems.contains(newItem)) {
            inventoryOfItems.add(newItem);
        }
        return false;




        for (int i = 0; i < getInventoryOfItems().size(); i++) {
            Item placeholderItem = getInventoryOfItems().get(i);
            if (!placeholderItem.equals(newItem)) {
                inventoryOfItems.add(newItem);
                return true;
            }
        }
        return false;
    }






            for (int i = 0; i < getInventoryOfItems().size(); i++) {
            Item placeholderItem = getInventoryOfItems().get(i);
            if (!placeholderItem.equals(newItem)) {
                inventoryOfItems.add(newItem);
                return true;
            }
        }
        return false;
