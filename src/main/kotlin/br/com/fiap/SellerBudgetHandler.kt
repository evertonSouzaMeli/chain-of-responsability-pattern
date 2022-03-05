package br.com.fiap

class SellerBudgetHandler : BaseBudgetHandler() {

    override fun handle(customBudget: CustomBudget): CustomBudget? {
        if (customBudget.total <= 1000) {
            println("o vendedor tratou o orçamento")
            customBudget.approved = true
            return customBudget
        }
        return super.handle(customBudget)
    }
}