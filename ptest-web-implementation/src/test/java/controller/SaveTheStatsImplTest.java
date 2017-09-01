package controller;

import contracts.data.Message;
import contracts.data.User;
import contracts.data.UserMassage;
import org.mockito.Mock;
import org.mockito.Matchers;
import static org.mockito.Mockito.when;

import org.junit.*;
import org.mockito.MockitoAnnotations;
import repository.AuditRepository;

/**
 * Created by chandrashekarj on 9/1/2017.
 */
public class SaveTheStatsImplTest {

    @Mock
    private AuditRepository ar;

    private SaveTheStatsImpl stsi;

    @Before
    public void initialize() {
        MockitoAnnotations.initMocks(this);

        stsi = new SaveTheStatsImpl(ar);
    }

    @Test
    public void testSaveTheUserMessage() throws Exception {

        //given
        UserMassage um = new UserMassage(new User("chandra"), new Message("test msg"));

        //when
        when(ar.saveAuditMessage(Matchers.anyString(), Matchers.anyInt())).thenReturn(true);


        boolean b = stsi.saveTheUserMessage(um);

        //then
        Assert.assertTrue(b);

    }
}
