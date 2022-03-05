package br.com.fiap

abstract class BaseBudgetHandler {
    private var nextHandler: BaseBudgetHandler? = null

    open fun handle(customBudget: CustomBudget): CustomBudget? {
        if (nextHandler != null)
            return this.nextHandler?.handle(customBudget)
        return customBudget
    }

    open fun setNextHandler(handler: BaseBudgetHandler): BaseBudgetHandler {
        this.nextHandler = handler
        return handler
    }
}