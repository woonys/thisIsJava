package Ch8;

public class MysqlDao implements DataAccessObject{
    String Mysql = "Mysql DB";
    @Override
    public void delete() {
        System.out.println(Mysql + "에서 삭제");
    }

    @Override
    public void insert() {
        System.out.println( Mysql + "에 삽입");
    }

    @Override
    public void select() {
        System.out.println( Mysql + "에서 검색");
    }

    @Override
    public void update() {
        System.out.println(Mysql + "를 수정");
    }
}
