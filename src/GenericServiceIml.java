public class GenericServiceIml implements GenericService<Person>{
    private GenericInterface<Person> genericInterface = new GenericInterfaceImpl();
    @Override
    public Person getById(Long id) {
        return genericInterface.getById(id);
    }
}
