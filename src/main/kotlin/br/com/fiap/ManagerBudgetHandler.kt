package br.com.fiap

class ManagerBudgetHandler : BaseBudgetHandler() {

    override fun handle(customBudget: CustomBudget): CustomBudget? {
        if (customBudget.total <= 5000) {
            println("o gerente tratou o orçamento")
            customBudget.approved = true
            return customBudget
        }
        return super.handle(customBudget)
    }
}