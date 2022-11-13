package net.clementlevallois.functions.model;

/**
 *
 * @author LEVALLOIS
 */
public class Prediction {

    String sourceId;
    String sourceLabel;
    int sourceDegree;
    String targetId;
    String targetLabel;
    int targetDegree;
    int predictionValue;

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceLabel() {
        return sourceLabel;
    }

    public void setSourceLabel(String sourceLabel) {
        this.sourceLabel = sourceLabel;
    }

    public int getSourceDegree() {
        return sourceDegree;
    }

    public void setSourceDegree(int sourceDegree) {
        this.sourceDegree = sourceDegree;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetLabel() {
        return targetLabel;
    }

    public void setTargetLabel(String targetLabel) {
        this.targetLabel = targetLabel;
    }

    public int getTargetDegree() {
        return targetDegree;
    }

    public void setTargetDegree(int targetDegree) {
        this.targetDegree = targetDegree;
    }

    public int getPredictionValue() {
        return predictionValue;
    }

    public void setPredictionValue(int predictionValue) {
        this.predictionValue = predictionValue;
    }

}
