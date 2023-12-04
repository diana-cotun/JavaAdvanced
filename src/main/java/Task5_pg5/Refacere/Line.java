package Task5_pg5.Refacere;

import Task1_pg1.Refacere.Point2D;

public class Line {

    private Point2D beginPoint = new Point2D();
    private Point2D endPoint = new Point2D();

    public Line(Point2D beginPoint, Point2D endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }
    public Line(float x1, float y1, float x2, float y2) {
        this.beginPoint.setXY(x1, y1);
        this.endPoint.setXY(x2, y2);
    }

    public Point2D getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point2D beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "beginPoint=" + beginPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    public Point2D getCenterLine() {
        float centerBeginPoint = (beginPoint.getX() + endPoint.getX()) / 2;
        float centerEndPoint = (beginPoint.getY() + endPoint.getY()) / 2;
        Point2D centerPoint = new Point2D(centerBeginPoint, centerEndPoint);
        return centerPoint;
    }
}
