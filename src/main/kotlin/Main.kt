

fun main(args: Array<String>) {
    val shopList = ShoppingList()
    shopList.viewShopItems()
    shopList.addShopItem("Bread")
    shopList.addShopItem("Apple")
    shopList.viewShopItems()
    shopList.deleteShopItem("Orange")
    shopList.addShopItem("Apple")
    shopList.viewShopItems()
    shopList.deleteShopItem("Apple")
    shopList.viewShopItems()
}