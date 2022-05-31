package Ch8;

public class OracleDao implements DataAccessObject{
    String Oracle = "Oracle DB";
    @Override
    public void delete() {
        System.out.println(Oracle + "에서 삭제");
    }

    @Override
    public void insert() {
        System.out.println( Oracle + "에 삽입");
    }

    @Override
    public void select() {
        System.out.println( Oracle + "에서 검색");
    }

    @Override
    public void update() {
        System.out.println(Oracle + "를 수정");
    }
}
