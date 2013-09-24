package net.antykanar.environment;

import com.google.inject.AbstractModule;

public class ProductionModules extends AbstractModule {

    public ProductionModules() {
        super();
    }

    @Override
    protected void configure() {
//        bind(IPersistanceFacade.class).to(PersistenceFacade.class);
//        bind(WebGatewayInterface.class).to(ProductionWebGatewayWithRedirect.class);

//        bind(ISBCartPersistanceFacade.class).to(SBCartPersistanceFacade.class);
//        bind(ITabHistoryContentStack.class).to(TabHistoryContentStack.class);
//        bind(ImageLoaderInterface.class).to(ImageLoader.class);
//        bind(Class.class).annotatedWith(Names.named("ErrorClass")).toInstance(SBErrorMessage.class);
//        bind(ErrorHandlerInterface.class).annotatedWith(Names.named("ExpiredTokenErrorHandler")).to(ExpiredTokenErrorHandler.class);
//        requestStaticInjection(EquipmentSearchTabFragment.class);
//        requestStaticInjection(CatalogListWithSearchTabFragment.class);
//        requestStaticInjection(LocationsTabFragment.class);

//        overrideBinding();
    }

//    protected void overrideBinding() {
//        bind(LogHelperInterface.class).to(ProductionLogHelper.class);
//        bind(PropertiesHelperInterface.class).to(ProductionPropertiesHelper.class);
//        bind(IApiRequester.class).to(ApiRequester.class);
//        bind(HockeyAppPropertiesInterface.class).to(HockeyAppProperties.class);
//        bind(IHockeyAppActivityStrategy.class).to(HockeyAppActivityStrategy.class);
//    }
}