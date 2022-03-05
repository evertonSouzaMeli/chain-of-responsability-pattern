package br.com.fiap

class CeoBudgetHandler : BaseBudgetHandler() {

    override fun handle(customBudget: CustomBudget): CustomBudget {
        println("o CEO tratou o orçamento")
        customBudget.approved = true
        return customBudget
    }
}