package structural.facade;

public class CalculationFacade {
    private BasePremiumCalculation basePremiumCalculation;
    private DiscountCalculation discountCalculation;
    private TaxCalculation taxCalculation;

    public CalculationFacade() {
        basePremiumCalculation = new BasePremiumCalculation();
        discountCalculation = new DiscountCalculation();
        taxCalculation = new TaxCalculation();
    }

    //Example 1
    public BasePremiumCalculation getBasePremiumCalculation() {
        return basePremiumCalculation;
    }

    //Example 2
    public double calculate(Object object) {
        return basePremiumCalculation.calculatePremium(object)
                - discountCalculation.calculateDiscount(object)
                + taxCalculation.calculateTax(object);
    }
}
