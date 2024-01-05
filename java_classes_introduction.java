class task
{
    
    private int length;
    private int width;
    private int height;
    public void set_length(int l)
    {
        length = l;
    }
    public void set_width(int w)
    {
        width =w;
    }
    public void set_height(int h)
    {
        height = h;
    }
    public void volume()
    {
          System.out.println(length*width*height);
    }
}