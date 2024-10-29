package JavaHomework3;

public class S3_4 {
    public static void main(String[] args)
    {
        TV tv = new TV();
        tv.getStatus();
        tv.TurnTV(); // 开机
        tv.changeChannel(5);
        tv.increaseVolume();
        tv.increaseVolume();
        tv.decreaseVolume();
        tv.getStatus();
        tv.TurnTV(); // 关机
    }
}
