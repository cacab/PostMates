package business.edu.cofc.cs656.services;
public class Chart implements IIncomeReportsServices {

    float data = (float) 300333234.32;

    @Override
    public float getMonthlyIncome(float payment) {
        return payment * data;
    }

    private float buildChart(float data) {

        float chartData = data;
        return chartData;
    }

}
