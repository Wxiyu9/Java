package MoiveDemo;

public class MoiveOperate {
    private moive[] moive;
    public void PrintAllMoive(moive[] moive){
        this.moive = moive;
        for(int i = 0; i < moive.length; i++) {
            System.out.println("id:" + moive[i].getId());
            System.out.println("name:" + moive[i].getName());
            System.out.println("score:" + moive[i].getScore());
        }
    }
    public void SearchById(int id){
        for(int i = 0; i < moive.length; i++)
        {
            if(moive[i].getId() == id)
            {
                System.out.println("找到了，name为：" + moive[i].getName());
                return;
            }
        }
        System.out.println("没找到");
    }
}
