package chap08.textbook.exercises.p04;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Orecle DB에서 검색");

	}

	@Override
	public void update() {
		System.out.println("Orecle DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Orecle DB에서 삭제");

	}

	@Override
	public void insert() {
		System.out.println("Orecle DB에서 삽입");

	}

}
