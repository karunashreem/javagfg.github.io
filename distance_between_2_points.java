class Solution
{
    public int distance(int x1, int y1, int x2, int y2)
    {
        // Code here
        double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return (int)Math.round(d);
    }
}