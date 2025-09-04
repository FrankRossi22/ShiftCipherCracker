
public class Decoder {
    public static void main(String[] args) {

        String cipherText = """
                BIVHA JVTTH UKLYZ DLYLA YHPUL KAVSP UNLYV UAOLJ VUCVF ZWYVQ
                LJALK SPULV MHKCH UJLHA AOLSP TPAVM CPZPI PSPAF BUAPS AOLMH
                SSVMK HYRAO LUAVZ BYMHJ LPMWV ZZPIS LDPAO PUAOL JVUCV FJVSB
                TUZMP YLZHS CVLZM YVTIV DHUKZ ALYUA BILZZ PTBSA HULVB ZSFHU
                KAVZB ITLYN LHUKT HRLAO LPYLZ JHWLH ZAOLL ZJVYA ZHWWL HYLKA
                OLKPM MPJBS AFMVY AOLBI VHAZD HZAVS VJHAL HJVUC VFPUA OLMPY
                ZAWSH JLAOL SPTPA VMCPZ PIPSP AFHAI LZAMY VTHJV UUPUN AVDLY
                DHZAL UTPSL ZHWHA YVSSP ULVMA LUBIV HAZJV BSKAO LYLMV YLJVC
                LYADV OBUKY LKADL UAFTP SLZVM ZLHHJ VUCVF VMMPM AFZOP WZTLH
                UDOPS LVJJB WPLKH MYVUA VMVUS FADLU AFMVB YOBUK YLKFH YKZPU
                AOLLU VYTVB ZZWHJ LZVMA OLHAS HUAPJ HASLH ZAUPU LTPSS PVUZX
                BHYLT PSLZV MVWLY HAPVU HSDHA LYZAO LVULJ VBSKI LTPZZ LKIFA
                OLVAO LYDPA OAOLN YLHAL ZALHZ LHUKB ZBHSS FDHZI HKDLH AOLYW
                SHFLK HWHYA OPKPU NAOLJ VUCVF ZMYVT NLYTH ULFLZ VYMVY JPUNB
                IVHAZ AVZLL RZOLS ALYMY VTAOL LSLTL UAZHA WLYPZ JVWLK LWAOZ
                VKPKY VBAPU LHSAL YHAPV UZVMJ VBYZL HUKLT LYNLU JFABY UZPMJ
                VUAHJ ADLYL THKLK LSPIL YHALY LYVBA PUNVM JVUCV FZOVD LCLYH
                DHFMY VTWHA YVSSP ULZHU KDVSM WHJRZ SVJHA LKIFI SLAJO SLFDH
                ZAOLT VZAWY VKBJA PCLTL AOVKK HCPKR HOUAO LNYLH AOPZA VYPHU
                VMJYF WAVNY HWOFN PCLZH KYHTH APJHJ JVBUA VMVUL ZBJOY LYVBA
                PUNJV UALZA PUOPZ IVVRV UAOLB IVHAD HYZLP GPUNA OLLUP NTHAO
                PZWHZ ZHNLL EJLYW ALKMY VTQVO URLLN HUPUA LSSPN LUJLP UDHYY""";

        //Set the number of times to shift each letter (excluding ' ' and '\n')
        int shift = 19;
        String decodedText = decodeShiftcipher(cipherText, shift);

        System.out.println("Decoded text with " + shift + " shifts: " + decodedText);

    }

    private static String decodeShiftcipher(String cipherText, int shift) {
        String decodedText = "";

        //for loop to go through each character in the cipherText, shift it, and then add it to the decodedText
        for (int i = 0; i < cipherText.length(); i++) {
            if(cipherText.charAt(i) == ' ' || cipherText.charAt(i) == '\n') {
                decodedText += cipherText.charAt(i);
                continue;
            }
            // Get the character value (0-25) by subtracting 'A', apply the shift, and convert back to a character
            int charVal = cipherText.charAt(i) - 'A';
            charVal = (charVal + shift) % 26; // Shift forward by j positions
            char decodedChar = (char) (charVal + 'A');
            decodedText += decodedChar;

        }
        return decodedText;
    }
}