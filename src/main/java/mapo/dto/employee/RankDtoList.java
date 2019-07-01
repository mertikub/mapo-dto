package mapo.dto.employee;

import java.util.ArrayList;
import java.util.List;

public class RankDtoList {

	private List<RankDto> ranks;
	
	public RankDtoList() {
		ranks = new ArrayList<RankDto>();
	}
	
	public RankDtoList(List<RankDto> ranks) {
		this();
		this.ranks.addAll(ranks);
	}

	public List<RankDto> getRanks() {
		return ranks;
	}

	public void setRanks(List<RankDto> ranks) {
		this.ranks = ranks;
	}
	
	
}
