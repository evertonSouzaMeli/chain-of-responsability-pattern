import br.com.fiap.*

fun main() {
    var customBudget: CustomBudget = CustomBudget(100001.0)
    var seller: SellerBudgetHandler = SellerBudgetHandler()

    seller.setNextHandler(ManagerBudgetHandler())
          .setNextHandler(DirectorBudgetHandler())
          .setNextHandler(CeoBudgetHandler())

    seller.handle(customBudget)

}