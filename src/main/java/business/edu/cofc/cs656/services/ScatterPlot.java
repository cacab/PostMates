package business.edu.cofc.cs656.services;

public class ScatterPlot  extends  Chart{

    public float scatterPlotData;

    public ScatterPlot(float scatterPlotData) {
        this.scatterPlotData = scatterPlotData;
    }

    private float buildScatterPlot(float data) {

        float chartData = data;
        return chartData;
    }

    public float getScatterPlotData() {
        return scatterPlotData;
    }

    public void setScatterPlotData(float scatterPlotData) {
        this.scatterPlotData = scatterPlotData;
    }
}
