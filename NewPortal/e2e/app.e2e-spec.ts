import { NewPortalPage } from './app.po';

describe('new-portal App', function() {
  let page: NewPortalPage;

  beforeEach(() => {
    page = new NewPortalPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
