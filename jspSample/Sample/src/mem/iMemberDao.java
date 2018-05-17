package mem;

public interface iMemberDao {

	public boolean addMember(MemberDto dto);	// account 용
	public MemberDto login(MemberDto dto);
}
