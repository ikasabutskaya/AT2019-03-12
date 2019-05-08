package by.it.okoyro.at21;

interface InterfaceDao <TYPE>{
	TYPE read (int id);
	boolean create (TYPE entity);
	boolean update (TYPE entity);
	boolean delete (TYPE entity);
}
