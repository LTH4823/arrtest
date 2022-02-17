package com.company;

public class PointMain {

    public static void main(String[] args) {

        Point pEast = new Point("동대문DDP",37.5628811,126.9988088);
        Point pWest = new Point("연세대학교",37.5566215,126.9701414);
        Point pNorth = new Point("북촌한옥마을",37.5619966,126.9788103);
        Point pSouth = new Point("남대문",37.5628811,126.9988088);

        Point target = new Point("내위치(을지로5가)",37.5631027,127.0036064);

        Point[] arr = new Point[4];
        arr[0] = pEast;
        arr[1] = pWest;
        arr[2] = pNorth;
        arr[3] = pSouth;

        double minDistance = 100000;
        Point minPoint = null;

        for (Point p: arr) {

            double distance =
                    Math.sqrt( Math.pow( p.lat - target.lat  ,2) +
                            Math.pow( p.lng - target.lng  ,2));

            if(distance < minDistance){
                minDistance = distance;
                minPoint = p;
            }
            //System.out.println(p.name +":" +distance);
        }//end for
        System.out.println("MIN DISTANCE: " + minDistance);
        System.out.println(minPoint);

    }
}
