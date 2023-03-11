

class ShoppingList {

    private val Items = mutableListOf<String>()

    fun viewShopItems() {
        if(!Items.isEmpty()) {
            Items.forEach { println("Item: ${it}") }
        }
        else println("Shopping List is empty :(")
    }

    fun addShopItem(item: String) = Items.add(item)

    fun deleteShopItem(item: String) {
        if(Items.contains(item)) {
            while(Items.contains(item)) Items.remove(item)
        }
        else println("There is no item with name: ${item}")
    }

    fun deleteAllShopItems() = Items.clear()
}