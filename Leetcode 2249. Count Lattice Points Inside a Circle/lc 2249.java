class Solution {
    public int countLatticePoints(int[][] circles) {
        HashSet<String> hs=new HashSet<>();
        for(int[] circle:circles){
            int cx=circle[0];
            int cy=circle[1];
            int r=circle[2];

            int maxL=cx-r;
            int maxR=cx+r;
            int maxD=cy-r;
            int maxU=cy+r;

            for (int x = maxL; x <= maxR; x++) {
                for (int y = maxD; y <= maxU; y++) {
                    if ((x - cx) * (x - cx) + (y - cy) * (y - cy) <= r * r) {
                        hs.add(x + "#" + y);
                    }
                }
            }

        }
        return hs.size();
    }
}