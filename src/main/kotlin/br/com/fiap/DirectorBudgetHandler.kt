package br.com.fiap

class DirectorBudgetHandler : BaseBudgetHandler() {

    override fun handle(customBudget: CustomBudget): CustomBudget? {
        if (customBudget.total <= 50000) {
            println("o diretor tratou o orçamento")
            customBudget.approved = true
            return customBudget
        }
        return super.handle(customBudget)
    }
}