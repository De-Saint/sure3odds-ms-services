package com.sure3odds.userservice.helper;



public class JWTHelper {

//    private static final Logger LOG = LoggerFactory.getLogger(JWTHelper.class.getName());
//    @Value("${sure.conf.param.jwt.enc-key}")
//    private String ENC_KEY;
//    @Value("${sure.conf.param.jwt.issuer}")
//    private String ISSUER;
//    @Value("${sure.conf.param.jwt.validity}")
//    private int validity;
//
//    public String createToken(Users user) {
//
//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.MINUTE, validity);
//        Date expiryDate = cal.getTime();
//        try {
//            Algorithm algorithm = Algorithm.HMAC256(ENC_KEY);
//            String token = JWT.create()
//                    .withIssuer(ISSUER)
//                    .withExpiresAt(expiryDate)
//                    .withIssuedAt(Calendar.getInstance().getTime())
//                    .withNotBefore(Calendar.getInstance().getTime())
//                    .withJWTId(user.getId().toString())
//                    .withClaim("user_type", user.getUsertypes().getName())
//                    .withClaim("name", user.getLastname())
//                    .sign(algorithm);
//            return token;
//        } catch (JWTCreationException | IllegalArgumentException exception) {
//            LOG.info(exception.getMessage());
//        }
//        //Invalid Signing configuration / Couldn't convert Claims.
//        return null;
//    }
//
//    public DecodedJWT validateToken(String token) {
//        try {
//            Algorithm algorithm = Algorithm.HMAC256(ENC_KEY);
//            JWTVerifier verifier = JWT.require(algorithm)
//                    .withIssuer(ISSUER)
//                    .build();
//            //Reusable verifier instance
//            DecodedJWT jwt = verifier.verify(token);
//            return jwt;
//        } catch (Exception exception) {
//            LOG.info(exception.getMessage());
//        }
//        //Invalid signature/claims
//        return null;
//    }
//
//    public DecodedJWT getUserId(String token) {
//        try {
//            Algorithm algorithm = Algorithm.HMAC256(ENC_KEY);
//            JWTVerifier verifier = JWT.require(algorithm)
//                    .withIssuer(ISSUER)
//                    .build();
//            //Reusable verifier instance
//            DecodedJWT jwt = verifier.verify(token);
//            return jwt;
//        } catch (Exception exception) {
//            //UTF-8 encoding not supported
//            LOG.info(exception.getMessage());
//        }
//        //Invalid signature/claims
//        return null;
//    }
}
