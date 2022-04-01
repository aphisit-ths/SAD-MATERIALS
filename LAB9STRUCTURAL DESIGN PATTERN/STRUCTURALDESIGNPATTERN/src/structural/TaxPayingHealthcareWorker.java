/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

/**
 *
 * @author ACER-OAT
 */
public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + worker.getName() + " with TaxPaying.");
    }

    @Override
    public double getPrice() {
        //adds 10% tax to the normal price of a HealthcareWork instance.
        double tax = super.getPrice() * 0.1;
        double workerPrice = super.getPrice();

        //adds 10%
        double taxPaying = workerPrice + tax;
        return taxPaying;
    }

}
