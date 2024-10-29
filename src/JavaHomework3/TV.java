package JavaHomework3;

public class TV {
    private static int idCounter = 0;//用于生成编号
    private int id;
    private boolean turn;//开关状态：真为开 假为关
    private int volume;//音量
    private int channel;//频道

    public TV() {
        this.id = idCounter++;
        this.turn = false;
        this.volume = 30;
        this.channel = 1;
    }
    //开关电视
    public void TurnTV(){
        turn = !turn;
        System.out.println(turn ? "电视已开启" : "电视已关闭");
    }
    // 增加音量
    public void increaseVolume()
    {
        if(turn)
        {
            if(volume < 100)
            {
                volume++;
                System.out.println("音量已提高到" + volume);
            }
            else{
                System.out.println("音量已到最大值");
            }
        }
        else
        {
            System.out.println("请先打开电视");
        }
    }
    //降低音量
    public void decreaseVolume()
    {
        if(turn)
        {
            if(volume > 0){
                volume--;
                System.out.println("音量已降低到" + volume);
            }
            else{
                System.out.println("音量已到最小");
            }
        }
        else{
            System.out.println("请先打开电视机");
        }
    }
    //控制频道
    public void changeChannel(int newChannel)
    {
        if(turn){
            this.channel = newChannel;
            System.out.println("频道已更换为" + newChannel);
        }
        else{
            System.out.println("请先打开电视机");
        }
    }
    // 获取电视机的状态
    public void getStatus() {
        System.out.println("商品编号: " + id);
        System.out.println("开关状态: " + (turn ? "开启" : "关闭"));
        System.out.println("音量: " + volume);
        System.out.println("频道: " + channel);
    }


}
