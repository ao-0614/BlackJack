package ascSys;

public enum Num {
	A{
	@Override
	public int getScore(boolean Achange){
		if(Achange == true){
			return 11;
		}
		return 1;
		}
	},
	N2,
	N3,
	N4,
	N5,
	N6,
	N7,
	N8,
	N9,
	N10,
	J{
	@Override
	public int getScore(boolean Achange){
		return 10;
		}
	}
	,Q{
	@Override
	public int getScore(boolean Achange){
		return 10;
		}
	}
	,K{
	@Override
		public int getScore(boolean Achange){
		return 10;
		}
	};

	public int getScore(boolean Achange){
		return this.ordinal()+1;
	}

}