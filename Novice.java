public class Novice extends GameCharacter
{
	//Attribute
	protected String playerName;
	protected String gender;
	protected int jobLvl;
	protected int statPoint;
	protected int jobPoint;
	protected int atkRange;
	protected Inventory equipedItems;
	protected Inventory inventory;
	protected int idxEquipItems;
	
	//Constructor
	
	//Menerima masukan titik pusat player serta nama player
	//Pada COnstructor ini menentukan tiap status player dengan me-random 1-10 dari tiap status, juga dilakukan instansiasi skill basic
	//Untuk ATKspeed = 0,1 * AGI -----Omongin lg sih. Masih bingung nentuinnya haha
	//Untuk SPrecovery mirip ATKspeed -----Omongin lg. haha
	public Player (float x, float y, String name, String gender)
	{
		int[] temp = new int[4];
		temp[1] = new Random().nextInt(5,10);
		temp[2] = new Random().nextInt(5,10);
		temp[3] = new Random().nextInt(5,10);
		temp[4] = new Random().nextInt(20,30);
		super(x,y,temp[1],temp[2],temp[4],temp[3],0,0,0,0);
		atkRange = 1;
		equipedItems = new Inventory();
		idxEquipItems = 0;
		inventory = new Inventory();
		idxInventory = 0;
		jobLvl = 0;
		statPoint = 0;
		jobPoint = 0;
		playerName = name;
		this.gender = gender;
	}
	
	//Methods
	
	//Menambah exp player
	//Menambah point exp player (base, job) sesuai parameter yang berasal dari exp monster
	public void incEXP (int base, int job)
	{
		this.baseEXP += base;
		this.jobEXP += job;
	} 
	
	//Menambah level player
	//Menambah level player jika exp telah mencukupi
	public void incBaseLvl ()
	{
		if (this.baseEXP >= 1000)
		{
			Lvl++;
			statPoint += 3;
			baseEXP = 0;
		}
		System.out.print("Base EXP : "+baseEXP+"\n");
	}
	
	//Menambah level job player
	//Menambah level job player jika exp telah mencukupi
	public void incJobLvl ()
	{	
		if (this.jobEXP >= 1000)
		{
			jobLvl++;
			jobPoint ++;
			jobEXP = 0;
		}
		System.out.print("Base EXP : "+baseEXP+"\n");
	}
	
	//Diserang monster
	//Menerima parameter masukan damage yang diberikan oleh monster
	public void monsterAtk (int damage)
	{
		currentHP -= damage;
	}
	
	//Use items
	//Menggunakan usable items yang ada di inventory, dengan memasukkan index item
	//Final State, barang inventory berkurang sesuai yang dipakai
	public void useItems (int idx)
	{
		(inventory.getItem(idx)).use();
	}
	
	//Add Items
	//Menambahkan item kedalam inventory jika masih memungkinkan
	public void addItems (Items item)
	{
		inventory.putItem(item);
	}
	
	//Use Equipment
	//Mamakai equipment yang ada di inventory
	public void equipItems (Items item)
	{
		
	}
	
	//Shows items
	//Menampilkan seluruh items dalam inventory
	public void showItems ()
	{
		for (int i=0;inventory.size;i++)
		{
			System.out.print()
		}
	}
	
	//Use Skill
	//Menggunakan skill yang dimiliki
	public void useSkill (int skillIdx)
	{
	}
	
	//Nested Class
	//Ability
	class BasicSkill implements Skill ()
	{
		//Attribute
		
		//Constructor
		//Inisiasi nama skill dan level skill
		public BasicSkill ()
		{		
		}
		
		//Methods
		public void useSkill ()
		{
			//Do Nothing
		}
		
		//Tambah skill level
		public void increaseLvl ()
		{
		}
	}
}
