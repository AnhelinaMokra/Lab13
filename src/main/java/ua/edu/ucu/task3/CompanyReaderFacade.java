package ua.edu.ucu.task3;

public class CompanyReaderFacade {

    protected PDLReader reader1;
    protected BrandFetchReader reader2;

    public CompanyReaderFacade() {
        reader1 = new PDLReader();
        reader2 = new BrandFetchReader();
    }

    public Company readCompany(String companyName) {
        Company company1 = null;
        Company company2 = null;

        try {
            company1 = reader1.fetch(companyName);
        } catch (Exception e) {
            System.err.println("PDLReader failed: " + e.getMessage());
        }

        try {
            company2 = reader2.fetch(companyName);
        } catch (Exception e) {
            System.err.println("BrandFetchReader failed: " + e.getMessage());
        }

        return mergeCompanies(company1, company2);
    }

    public Company mergeCompanies(Company company1, Company company2) {
        Company result = new Company();

        result.setName(
                (company1 != null && company1.getName() != null && !company1.getName().isEmpty())
                        ? company1.getName()
                        : (company2 != null ? company2.getName() : null)
        );

        result.setDescription(
                (company1 != null && company1.getDescription() != null && !company1.getDescription().isEmpty())
                        ? company1.getDescription()
                        : (company2 != null ? company2.getDescription() : null)
        );


        return result;
    }
}